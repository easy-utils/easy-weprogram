package com.rainyblossom.opensource.weeasy.weprogram.service.auth;

import cn.hutool.core.lang.Validator;
import com.rainyblossom.opensource.weeasy.weprogram.config.AuthConfig;
import com.rainyblossom.opensource.weeasy.weprogram.config.TokenConfig;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthCodeToSessionRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthPaidUnionIdRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthTokenRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthCodeToSessionResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthPaidUnionIdResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthTokenResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.util.HttpUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

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
