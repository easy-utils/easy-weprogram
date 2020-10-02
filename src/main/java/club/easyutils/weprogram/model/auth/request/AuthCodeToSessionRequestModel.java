package club.easyutils.weprogram.model.auth.request;

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthCodeToSessionRequestModel extends BaseRequestModel {

    /**
     * 小程序 appId
     */
    @NonNull
    private String appid;

    /**
     * 小程序 appSecret
     */
    @NonNull
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
