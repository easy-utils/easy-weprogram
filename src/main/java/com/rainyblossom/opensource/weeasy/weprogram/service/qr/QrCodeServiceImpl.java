package com.rainyblossom.opensource.weeasy.weprogram.service.qr;

import com.alibaba.fastjson.JSONObject;
import com.rainyblossom.opensource.weeasy.weprogram.config.QrCodeConfig;
import com.rainyblossom.opensource.weeasy.weprogram.model.BaseRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrCreateRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrGetRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrUnlimitedRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.response.QrResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.util.HttpUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QrCodeServiceImpl implements QrCodeService{

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
