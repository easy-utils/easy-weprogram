package club.easyutils.weprogram.model.auth.response;

import club.easyutils.weprogram.model.BaseResponseModel;
import lombok.Data;

@Data
public class AuthTokenResponseModel extends BaseResponseModel {

    private String access_token;

    private Integer expires_in;


}
