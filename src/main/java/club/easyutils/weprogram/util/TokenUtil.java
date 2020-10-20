package club.easyutils.weprogram.util;

/*-
 * Starttag
 * easy weprogram
 * #
 * Copyright (C) 2020 easy weprogram
 * #
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Endtag
 */

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import club.easyutils.weprogram.constant.GuavaConstant;
import club.easyutils.weprogram.model.auth.request.AuthTokenRequestModel;
import club.easyutils.weprogram.service.auth.AuthService;
import club.easyutils.weprogram.service.token.TokenConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Component
public class TokenUtil {

    private static Logger logger = Logger.getLogger(TokenUtil.class.getName());

    @Autowired
    private AuthService authService;

    @Autowired(required = false)
    private TokenConfig tokenConfig;

    private static TokenUtil tokenUtil;

    @PostConstruct
    public void init() {
        tokenUtil = this;
    }

    public static String getAccessToken() {
        String value = null;
        if (null != tokenUtil.tokenConfig){
            Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1).expireAfterWrite(7200, TimeUnit.SECONDS).build();
            try {
                value =  cache.get(GuavaConstant.ACCESS_TOKEN.getCacheName(), new Callable<String>() {
                    @Override
                    public String call() { return generateAccessToken(tokenUtil.tokenConfig.getAppId(), tokenUtil.tokenConfig.getAppSecret()); }
                });
            } catch (ExecutionException e) {
                logger.warning("TokenService Failed.");
            }
        }
        return value;
    }

    private static String generateAccessToken(String appId, String appSecret){
        AuthTokenRequestModel requestModel = new AuthTokenRequestModel(appId, appSecret);
        return tokenUtil.authService.getAccessToken(requestModel).getAccess_token();
    }
}
