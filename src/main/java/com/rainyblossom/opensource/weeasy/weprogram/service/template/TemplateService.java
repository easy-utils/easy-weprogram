package com.rainyblossom.opensource.weeasy.weprogram.service.template;


import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateAddRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateGetRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.request.TemplateSendRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateAddResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateGetResponseModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.template.response.TemplateSendResponseModel;

public interface TemplateService {

    /**
     * 新增模板
     * @param requestModel
     * @return
     */
    TemplateAddResponseModel addTemplate(TemplateAddRequestModel requestModel);

    /**
     * 获取模板列表
     * @return
     */
    TemplateGetResponseModel getTemplate(TemplateGetRequestModel requestModel);

    /**
     * 发送订阅消息
     * @param requestModel
     * @return
     */
    TemplateSendResponseModel send(TemplateSendRequestModel requestModel);



}
