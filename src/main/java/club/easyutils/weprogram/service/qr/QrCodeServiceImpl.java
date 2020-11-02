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

import club.easyutils.weprogram.model.BaseRequestModel;
import club.easyutils.weprogram.model.qr.request.QrCreateRequestModel;
import club.easyutils.weprogram.model.qr.request.QrGetRequestModel;
import club.easyutils.weprogram.model.qr.request.QrUnlimitedRequestModel;
import club.easyutils.weprogram.model.qr.response.QrResponseModel;
import club.easyutils.weprogram.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import club.easyutils.weprogram.config.QrCodeConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QrCodeServiceImpl implements QrCodeService {

    @Override
    public QrResponseModel getCreate(QrCreateRequestModel requestModel) {
        return doQrPost(QrCodeConfig.QR_CODE_CREATE.getUrl(), requestModel);
    }

    @Override
    public QrResponseModel get(QrGetRequestModel requestModel) {
        return doQrPost(QrCodeConfig.QR_CODE_GET.getUrl(), requestModel);
    }

    @Override
    public QrResponseModel getUnlimited(QrUnlimitedRequestModel requestModel) {
        return doQrPost(QrCodeConfig.QR_CODE_UNLIMITED.getUrl(), requestModel);
    }

    private QrResponseModel doQrPost(String url, BaseRequestModel requestModel){
        ResponseEntity<byte[]> response = HttpUtil.getRestTemplate().postForEntity(url, JSONObject.toJSONString(requestModel), byte[].class);
        String wxReturnStr = new String(response.getBody());
        QrResponseModel responseModel = new QrResponseModel();
        if (wxReturnStr.indexOf("errcode") != -1) {
            JSONObject json = JSONObject.parseObject(wxReturnStr);
            responseModel.setErrcode(json.get("errcode").toString());
            responseModel.setErrmsg(json.get("errmsg").toString());
        } else {
            responseModel.setContentType("image/jpeg");
            responseModel.setBuffer(response.getBody());
        }
        return responseModel;
    }
}
