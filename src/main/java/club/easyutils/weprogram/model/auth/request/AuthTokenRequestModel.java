package club.easyutils.weprogram.model.auth.request;

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenRequestModel extends BaseRequestModel {

    private String appid;

    private String secret;

    private String grant_type = "client_credential";

    public AuthTokenRequestModel(String appid, String secret) {
        this.appid = appid;
        this.secret = secret;
    }
}
