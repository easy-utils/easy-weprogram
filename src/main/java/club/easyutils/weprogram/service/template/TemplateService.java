package club.easyutils.weprogram.service.template;

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
