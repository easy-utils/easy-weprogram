package club.easyutils.weprogram.model.advertise.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AdvertiseAddActions {

    /**
     * 转化行为发生页面的URL，小程序可在路径前增加"http://www." 或直接填写 "http://www.qq.com"
     * 校验逻辑：
     * 1.以『http://www.』 开头；
     * 2.必须为纯小写；
     * 3.必须包含『.』
     */
    private String url;

    /**
     * 行为发生时，客户端的时间点。广告平台使用的是GMT+8的时间，容错范围是前后10秒，UNIX时间，单位为秒，如果不填将使用服务端时间填写
     */
    private Long action_time;

    /**
     * 预定义的行为类型，目前只支持COMPLETE_ORDER（下单）及RESERVATION（表单预约）、CONFIRM_EFFECTIVE_LEADS（有效销售线索）
     */
    private String action_type;


    private AdvertiseAddTrace trace;

    /**
     * 行为所带的参数，转化行为价值（例如金额），详见附录，字段长度最小 1 字节，长度最大 204800 字节
     */
    private AdvertiseAddActionsParam action_param;

}
