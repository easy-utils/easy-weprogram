package club.easyutils.weprogram.converter;

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
