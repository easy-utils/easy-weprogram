package club.easyutils.weprogram.config;

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

import club.easyutils.weprogram.util.ConfigUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TemplateUrlConfig {

    /**
     * 组合模板并添加至帐号下的个人模板库
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.addTemplate.html
     */
    ADD_TEMPLATE("https://api.weixin.qq.com/wxaapi/newtmpl/addtemplate?access_token=ACCESS_TOKEN"),
    /**
     * 删除帐号下的个人模板
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.deleteTemplate.html
     */
    DELETE_TEMPLATE("https://api.weixin.qq.com/wxaapi/newtmpl/deltemplate?access_token=ACCESS_TOKEN"),
    /**
     * 获取小程序账号的类目
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getCategory.html
     */
    GET_CATEGORY("https://api.weixin.qq.com/wxaapi/newtmpl/getcategory?access_token=ACCESS_TOKEN"),
    /**
     * 获取模板标题下的关键词列表
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getPubTemplateKeyWordsById.html
     */
    GET_TEMPLATE_KEY_WORDS("https://api.weixin.qq.com/wxaapi/newtmpl/getpubtemplatekeywords?access_token=ACCESS_TOKEN"),
    /**
     * 获取帐号所属类目下的公共模板标题
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getPubTemplateTitleList.html
     */
    GET_TEMPLATE_TITLE_LIST("https://api.weixin.qq.com/wxaapi/newtmpl/getpubtemplatetitles?access_token=ACCESS_TOKEN"),
    /**
     * 获取当前帐号下的个人模板列表
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getTemplateList.html
     */
    GET_TEMPLATE_LIST("https://api.weixin.qq.com/wxaapi/newtmpl/gettemplate?access_token=ACCESS_TOKEN"),
    /**
     * 发送订阅消息
     * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.send.html
     */
    SEND("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=ACCESS_TOKEN");

    private String url;

    public String getUrl() {
        return ConfigUtil.converter(url);
    }
}
