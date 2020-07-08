package com.rainyblossom.opensource.weeasy.weprogram.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum GuavaConstant {

    ACCESS_TOKEN("cache_weprogram_access_token");

    @Getter
    private String cacheName;

}
