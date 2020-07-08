package com.rainyblossom.opensource.weeasy.weprogram.service.auth;

import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthCodeToSessionRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthPaidUnionIdRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.request.AuthTokenRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthCodeToSessionResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthPaidUnionIdResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.auth.response.AuthTokenResponseModel;

public interface AuthService {

    /**
     * 登录凭证校验
     * @param authCodeToSessionRequestModel
     * @return
     */
    AuthCodeToSessionResponseModel code2Session(AuthCodeToSessionRequestModel authCodeToSessionRequestModel);

    /**
     * 用户支付完成后，获取该用户的 UnionId
     * @param requestModel
     * @return
     */
    AuthPaidUnionIdResponseModel getPaidUnionId(AuthPaidUnionIdRequestModel requestModel);

    /**
     * 获取小程序全局唯一后台接口调用凭据（access_token）。调用绝大多数后台接口时都需使用 access_token，开发者需要进行妥善保存.
     * @param requestModel
     * @return
     */
    AuthTokenResponseModel getAccessToken(AuthTokenRequestModel requestModel);
}
