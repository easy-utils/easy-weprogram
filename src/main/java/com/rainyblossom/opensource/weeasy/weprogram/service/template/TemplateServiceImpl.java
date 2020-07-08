package com.rainyblossom.opensource.weeasy.weprogram.service.template;

import com.alibaba.fastjson.JSONObject;
import com.rainyblossom.opensource.weeasy.weprogram.config.TemplateUrlConfig;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateAddRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateGetRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateSendRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateAddResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateGetResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateSendResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.util.HttpUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceImpl implements TemplateService{

    public TemplateAddResponseModel addTemplate(TemplateAddRequestModel requestModel) {
        return HttpUtil.getRestTemplate().postForEntity(TemplateUrlConfig.ADD_TEMPLATE.getUrl(), JSONObject.toJSONString(requestModel), TemplateAddResponseModel.class).getBody();
    }

    public TemplateGetResponseModel getTemplate(TemplateGetRequestModel requestModel) {
        return HttpUtil.getRestTemplate().getForEntity(TemplateUrlConfig.GET_TEMPLATE_LIST.getUrl(), TemplateGetResponseModel.class).getBody();
    }

    public TemplateSendResponseModel send(TemplateSendRequestModel requestModel) {
        return HttpUtil.getRestTemplate().postForEntity(TemplateUrlConfig.SEND.getUrl(), JSONObject.toJSONString(requestModel), TemplateSendResponseModel.class).getBody();
    }
}
