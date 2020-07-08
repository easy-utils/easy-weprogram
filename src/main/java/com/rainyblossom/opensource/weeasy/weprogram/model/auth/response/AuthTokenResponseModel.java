package com.rainyblossom.opensource.weeasy.weprogram.model.auth.response;

import com.rainyblossom.opensource.weeasy.weprogram.model.BaseResponseModel;
import lombok.Data;

@Data
public class AuthTokenResponseModel extends BaseResponseModel {

    private String access_token;

    private Integer expires_in;


}
