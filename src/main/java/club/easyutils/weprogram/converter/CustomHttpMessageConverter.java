package club.easyutils.weprogram.converter;

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

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信接口文档虽说返回的是 JSON 数据，但是同时返回的 Header 里面的 Content-Type 值却是 text/plain 。
 * 最终结果就是导致 RestTemplate 把数据从 HttpResponse 转换成 Object 的时候，找不到合适的 HttpMessageConverter 来转换
 */
public class CustomHttpMessageConverter extends MappingJackson2HttpMessageConverter {

    public CustomHttpMessageConverter() {
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        mediaTypes.add(MediaType.TEXT_HTML);
        setSupportedMediaTypes(mediaTypes);
    }

}
