package club.easyutils.weprogram.model.qr.response;

import club.easyutils.weprogram.model.BaseResponseModel;
import lombok.Data;

@Data
public class QrResponseModel extends BaseResponseModel {

    private String contentType;

    private byte[] buffer;
}
