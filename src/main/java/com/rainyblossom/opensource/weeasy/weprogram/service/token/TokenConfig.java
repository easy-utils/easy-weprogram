package com.rainyblossom.opensource.weeasy.weprogram.service.token;

/**
 * 获取配置
 */
public interface TokenConfig {

    /**
     * 获取 AppId
     * @return
     */
    String getAppId();

    /**
     * 获取 AppSecret
     * @return
     */
    String getAppSecret();
}
