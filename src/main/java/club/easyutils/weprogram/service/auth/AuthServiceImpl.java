package club.easyutils.weprogram.service.auth;

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
