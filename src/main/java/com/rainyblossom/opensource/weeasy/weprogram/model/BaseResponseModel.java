package com.rainyblossom.opensource.weeasy.weprogram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseModel implements Serializable {

    private static final long serialVersionUID = -2693350771119419213L;

    private String errcode;

    private String errmsg;
}
