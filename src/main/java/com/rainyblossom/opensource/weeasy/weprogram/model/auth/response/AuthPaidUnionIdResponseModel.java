package com.rainyblossom.opensource.weeasy.weprogram.model.auth.response;

import com.rainyblossom.opensource.weeasy.weprogram.model.BaseResponseModel;
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
