package club.easyutils.weprogram.service.template;


import club.easyutils.weprogram.model.template.request.TemplateAddRequestModel;
import club.easyutils.weprogram.model.template.request.TemplateGetRequestModel;
import club.easyutils.weprogram.model.template.request.TemplateSendRequestModel;
import club.easyutils.weprogram.model.template.response.TemplateAddResponseModel;
import club.easyutils.weprogram.model.template.response.TemplateGetResponseModel;
import club.easyutils.weprogram.model.template.response.TemplateSendResponseModel;

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
