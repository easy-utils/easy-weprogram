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
import club.easyutils.weprogram.model.auth.request.AuthCodeToSessionRequestModel;
import club.easyutils.weprogram.model.auth.response.AuthCodeToSessionResponseModel;
import club.easyutils.weprogram.model.auth.response.AuthPaidUnionIdResponseModel;
import club.easyutils.weprogram.model.auth.response.AuthTokenResponseModel;

public interface AuthorizeService {

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
