package com.rainyblossom.opensource.weeasy.weprogram.config;

import com.rainyblossom.opensource.weeasy.weprogram.util.ConfigUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AuthConfig {

    /**
     * 登录凭证校验。通过 wx.login 接口获得临时登录凭证 code 后传到开发者服务器调用此接口完成登录流程。
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/login/auth.code2Session.html
     */
    AUTH_CODE_TO_SESSION("https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code"),

    /**
     * 用户支付完成后，获取该用户的 UnionId，无需用户授权。本接口支持第三方平台代理查询。
     * 注意：调用前需要用户完成支付，且在支付后的五分钟内有效。
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/user-info/auth.getPaidUnionId.html
     */
    AUTH_GET_PAID_UNION_ID("https://api.weixin.qq.com/wxa/getpaidunionid?access_token=ACCESS_TOKEN&openid=OPENID");


    private String url;

    public String getUrl() {
        return ConfigUtil.converter(url);
    }

}
