package club.easyutils.weprogram.model.auth.request;

import club.easyutils.weprogram.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPaidUnionIdRequestModel extends BaseRequestModel {

    /**
     * 支付用户唯一标识
     */
    @NonNull
    private String openid;

    /**
     * 微信支付订单号
     * https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=9_7
     */
    @NonNull
    private String transaction_id;

    /**
     * 微信支付分配的商户号，和商户订单号配合使用
     * https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=9_7
     */
    private String mch_id;

    /**
     * 微信支付商户订单号，和商户号配合使用
     * https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=9_7
     */
    private String out_trade_no;
}
