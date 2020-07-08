package com.rainyblossom.opensource.weeasy.weprogram.model.template.response;

import com.rainyblossom.opensource.weeasy.weprogram.model.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TemplateGetResponseModel extends BaseResponseModel {

    /**
     * 个人模板列表
     */
    List<TemplateModel> data;
}

