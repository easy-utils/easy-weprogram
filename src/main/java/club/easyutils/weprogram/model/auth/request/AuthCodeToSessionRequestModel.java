package club.easyutils.weprogram.model.auth.request;

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

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthCodeToSessionRequestModel extends BaseRequestModel {

    /**
     * 小程序 appId
     */
    private String appid;

    /**
     * 小程序 appSecret
     */
    private String secret;

    /**
     * 登录时获取的 code
     */
    private String js_code;

    /**
     * 授权类型，此处只需填写 authorization_code
     */
    private String grant_type = "authorization_code";
}
