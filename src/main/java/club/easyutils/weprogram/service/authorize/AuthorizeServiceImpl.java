package club.easyutils.weprogram.service.authorize;

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

import club.easyutils.weprogram.model.auth.request.AuthPaidUnionIdRequestModel;
import club.easyutils.weprogram.model.auth.request.AuthTokenRequestModel;
import club.easyutils.weprogram.util.HttpUtil;
import cn.hutool.core.lang.Validator;
import club.easyutils.weprogram.config.AuthConfig;
import club.easyutils.weprogram.config.TokenConfig;
import club.easyutils.weprogram.model.auth.request.AuthCodeToSessionRequestModel;
import club.easyutils.weprogram.model.auth.response.AuthCodeToSessionResponseModel;
import club.easyutils.weprogram.model.auth.response.AuthPaidUnionIdResponseModel;
import club.easyutils.weprogram.model.auth.response.AuthTokenResponseModel;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeServiceImpl implements AuthorizeService {

    @Override
    public AuthCodeToSessionResponseModel code2Session(AuthCodeToSessionRequestModel requestModel) {
        String url = AuthConfig.AUTH_CODE_TO_SESSION.getUrl()
                .replace("APPID", requestModel.getAppid())
                .replace("SECRET", requestModel.getSecret())
                .replace("JSCODE",requestModel.getJs_code());
        return HttpUtil.getRestTemplate().getForObject(url, AuthCodeToSessionResponseModel.class);
    }

    @Override
    public AuthPaidUnionIdResponseModel getPaidUnionId(AuthPaidUnionIdRequestModel requestModel) {
        String url = AuthConfig.AUTH_GET_PAID_UNION_ID.getUrl()
                .replace("OPENID", requestModel.getOpenid());

        if (Validator.isNotNull(requestModel.getMch_id())){
            url.concat("&mch_id=" + requestModel.getMch_id());
        }
        if (Validator.isNotNull(requestModel.getTransaction_id())){
            url.concat("&transaction_id=" + requestModel.getTransaction_id());
        }
        if (Validator.isNotNull(requestModel.getOut_trade_no())){
            url.concat("&out_trade_no=" + requestModel.getOut_trade_no());
        }

        return HttpUtil.getRestTemplate().getForEntity(url, AuthPaidUnionIdResponseModel.class).getBody();
    }

    @Override
    public AuthTokenResponseModel getAccessToken(AuthTokenRequestModel requestModel) {
        String url = TokenConfig.TOKEN.getUrl()
                .replace("APPID", requestModel.getAppid())
                .replace("APPSECRET", requestModel.getSecret());
        return HttpUtil.getRestTemplate().getForEntity(url, AuthTokenResponseModel.class).getBody();
    }
}
