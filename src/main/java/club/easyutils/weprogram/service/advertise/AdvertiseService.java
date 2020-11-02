package club.easyutils.weprogram.service.advertise;


import club.easyutils.weprogram.model.advertise.request.AdvertiseAddRequestModel;
import club.easyutils.weprogram.model.advertise.response.AdvertiseAddResponseModel;

/**
 * 广告主业务
 * @author rainyblossom
 */
public interface AdvertiseService {

    /**
     * 添加转化跟踪信息
     * @link https://ad.weixin.qq.com/guide/457
     * @param request
     * @return
     */
    AdvertiseAddResponseModel addUserAction(AdvertiseAddRequestModel request);
}
