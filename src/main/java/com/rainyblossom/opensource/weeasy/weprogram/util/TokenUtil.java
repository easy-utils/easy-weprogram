package com.rainyblossom.opensource.weeasy.weprogram.util;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.rainyblossom.opensource.weeasy.weprogram.constant.GuavaConstant;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthTokenRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.service.auth.AuthService;
import com.rainyblossom.opensource.weeasy.weprogram.service.token.TokenConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
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
            Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(7200).build();
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
