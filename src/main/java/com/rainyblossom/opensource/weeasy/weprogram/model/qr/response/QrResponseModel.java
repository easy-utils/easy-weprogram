package com.rainyblossom.opensource.weeasy.weprogram.model.qr.response;

import com.rainyblossom.opensource.weeasy.weprogram.model.BaseResponseModel;
import lombok.Data;

@Data
public class QrResponseModel extends BaseResponseModel {

    private String contentType;

    private byte[] buffer;
}
