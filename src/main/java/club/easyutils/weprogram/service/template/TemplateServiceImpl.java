package club.easyutils.weprogram.service.template;

import club.easyutils.weprogram.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import club.easyutils.weprogram.config.TemplateUrlConfig;
import club.easyutils.weprogram.model.template.request.TemplateAddRequestModel;
import club.easyutils.weprogram.model.template.request.TemplateGetRequestModel;
import club.easyutils.weprogram.model.template.request.TemplateSendRequestModel;
import club.easyutils.weprogram.model.template.response.TemplateAddResponseModel;
import club.easyutils.weprogram.model.template.response.TemplateGetResponseModel;
import club.easyutils.weprogram.model.template.response.TemplateSendResponseModel;
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
