package club.easyutils.weprogram.service.qr;

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
