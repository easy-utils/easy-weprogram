package club.easyutils.weprogram.service.qr;

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

import club.easyutils.weprogram.model.qr.request.QrCreateRequestModel;
import club.easyutils.weprogram.model.qr.request.QrGetRequestModel;
import club.easyutils.weprogram.model.qr.request.QrUnlimitedRequestModel;
import club.easyutils.weprogram.model.qr.response.QrResponseModel;

public interface QrCodeService {

    /**
     * 获取小程序二维码，适用于需要的码数量较少的业务场景。通过该接口生成的小程序码，永久有效，有数量限制
     * @param requestModel
     * @return
     */
    QrResponseModel getCreate(QrCreateRequestModel requestModel);

    /**
     * 获取小程序码，适用于需要的码数量较少的业务场景。通过该接口生成的小程序码，永久有效，有数量限制
     * @param requestModel
     * @return
     */
    QrResponseModel get(QrGetRequestModel requestModel);

    /**
     * 获取小程序码，适用于需要的码数量极多的业务场景。通过该接口生成的小程序码，永久有效，数量暂无限制
     * @param requestModel
     * @return
     */
    QrResponseModel getUnlimited(QrUnlimitedRequestModel requestModel);
}
