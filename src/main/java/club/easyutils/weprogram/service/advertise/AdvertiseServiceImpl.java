package club.easyutils.weprogram.service.advertise;

import club.easyutils.weprogram.config.AdvertiseConfig;
import club.easyutils.weprogram.model.advertise.request.AdvertiseAddRequestModel;
import club.easyutils.weprogram.model.advertise.response.AdvertiseAddResponseModel;
import club.easyutils.weprogram.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * 广告主业务
 * @author rainyblossom
 */
@Service
public class AdvertiseServiceImpl implements AdvertiseService{

    Logger logger = Logger.getLogger(AdvertiseService.class.getName());

    @Override
    public AdvertiseAddResponseModel addUserAction(AdvertiseAddRequestModel requestModel) {
        logger.info(JSONObject.toJSONString(requestModel));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity<AdvertiseAddRequestModel> requestEntity = new HttpEntity<>(requestModel, headers);
        return HttpUtil.getRestTemplate().exchange(AdvertiseConfig.ADD_USER_ACTION.getUrl(), HttpMethod.POST, requestEntity, AdvertiseAddResponseModel.class).getBody();
    }
}
