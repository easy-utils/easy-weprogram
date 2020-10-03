package club.easyutils.weprogram.config;

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

import club.easyutils.weprogram.util.ConfigUtil;
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
