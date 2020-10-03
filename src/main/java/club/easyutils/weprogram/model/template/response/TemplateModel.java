package club.easyutils.weprogram.model.template.response;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateModel {

    /**
     * 添加至帐号下的模板 id，发送小程序订阅消息时所需
     */
    private String priTmplId;

    /**
     * 模版标题
     */
    private String title;

    /**
     * 模版内容
     */
    private String content;

    /**
     * 模板内容示例
     */
    private String example;

    /**
     * 模版类型，2 为一次性订阅，3 为长期订阅
     */
    private Integer type;

}
