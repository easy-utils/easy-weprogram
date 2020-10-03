package club.easyutils.weprogram.util;

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
