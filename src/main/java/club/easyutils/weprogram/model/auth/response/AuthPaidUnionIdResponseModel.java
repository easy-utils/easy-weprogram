package club.easyutils.weprogram.model.auth.response;

import club.easyutils.weprogram.model.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPaidUnionIdResponseModel extends BaseResponseModel {

    /**
     * 用户唯一标识，调用成功后返回
     */
    private String unionid;
}
