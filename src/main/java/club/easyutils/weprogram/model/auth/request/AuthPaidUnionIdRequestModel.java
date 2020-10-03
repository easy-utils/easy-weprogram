package club.easyutils.weprogram.model.auth.request;

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
