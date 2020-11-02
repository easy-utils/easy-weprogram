package club.easyutils.weprogram.config;

import club.easyutils.weprogram.util.ConfigUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AdvertiseConfig {

    /**
     * 登录凭证校验。通过 wx.login 接口获得临时登录凭证 code 后传到开发者服务器调用此接口完成登录流程。
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/login/auth.code2Session.html
     */
    ADD_USER_ACTION("https://api.weixin.qq.com/marketing/user_actions/add?version=v1.0&access_token=ACCESS_TOKEN")

    ;

    private String url;

    public String getUrl() {
        return ConfigUtil.converter(url);
    }

}
