package club.easyutils.weprogram.model.advertise.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
public class AdvertiseAddActionsParam {

    /**
     * 代表订单金额，单位为分，需要填写到param中获取，例如商品单价40元，需赋值为4000
     */
    private BigDecimal value;

    /**
     * 回传有效销售线索必填
     * 有效线索的来源区分，目前支持PHONE（电话直呼），RESERVE（表单预约）
     */
    private String leads_type;

}
