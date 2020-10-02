package club.easyutils.weprogram.util;

import club.easyutils.weprogram.model.BaseRequestModel;
import club.easyutils.weprogram.model.BaseResponseModel;
import cn.hutool.core.lang.Validator;
import com.alibaba.fastjson.JSONObject;
import club.easyutils.weprogram.converter.CustomHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class HttpUtil<T> {

    private static RestTemplate restTemplate;

    public static RestTemplate getRestTemplate() {
        if (Validator.isNull(restTemplate)){
            restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new CustomHttpMessageConverter());
        }
        return restTemplate;
    }

    public static BaseResponseModel doPost(String url, BaseRequestModel baseRequestModel){
        return getRestTemplate().postForEntity(url, JSONObject.toJSONString(baseRequestModel), BaseResponseModel.class).getBody();
    }

    public static BaseResponseModel doGet(String url){
        return getRestTemplate().getForEntity(url, BaseResponseModel.class).getBody();
    }



}
