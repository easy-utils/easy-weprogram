package com.rainyblossom.opensource.weeasy.weprogram.util;


import java.text.MessageFormat;

public class ConfigUtil {

    private static String ACCESS_TOKEN = "ACCESS_TOKEN";

    public static String converter(String url){
        if (url.contains(ACCESS_TOKEN)){
            String accessToken = TokenUtil.getAccessToken();
            url = url.replace("ACCESS_TOKEN", accessToken);
        }
        return url;
    }


}
