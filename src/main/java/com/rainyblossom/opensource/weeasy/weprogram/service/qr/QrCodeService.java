package com.rainyblossom.opensource.weeasy.weprogram.service.qr;

import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrCreateRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrGetRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.request.QrUnlimitedRequestModel;
import com.rainyblossom.opensource.weeasy.weprogram.model.qr.response.QrResponseModel;

public interface QrCodeService {

    /**
     * 获取小程序二维码，适用于需要的码数量较少的业务场景。通过该接口生成的小程序码，永久有效，有数量限制
     * @param requestModel
     * @return
     */
    QrResponseModel getCreate(QrCreateRequestModel requestModel);

    /**
     * 获取小程序码，适用于需要的码数量较少的业务场景。通过该接口生成的小程序码，永久有效，有数量限制
     * @param requestModel
     * @return
     */
    QrResponseModel get(QrGetRequestModel requestModel);

    /**
     * 获取小程序码，适用于需要的码数量极多的业务场景。通过该接口生成的小程序码，永久有效，数量暂无限制
     * @param requestModel
     * @return
     */
    QrResponseModel getUnlimited(QrUnlimitedRequestModel requestModel);
}
