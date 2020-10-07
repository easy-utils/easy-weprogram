<img src="https://resource.rainyblossom.com/image/opensource/website/eu_logo-removebg-preview.png" width="80%">

# Easy Weprogram  ![Logo](https://img.shields.io/badge/寄雨瑶花-易用工具系列-green) ![Build](http://api.travis-ci.org/easy-utils/easy-weprogram.svg?branch=master)

> [Easy Utils](https://east-utils.club) 易用工具包系列，提供了电子商务相关领域内，基于各产品官方文档的基础封装包，Java 开发人员可以通过简单地引用来实现产品的快速接入，帮助加速软件功能开发进程，避免重复且无意义的工作。

## 介绍

[Easy WeProgram](https://east-utils.club/project/easy-weprogram) 是基于微信小程序服务端文档的基础封装包，通过引用本 SDK 可以快速接入小程序服务端的相关接口。

## 使用方法
STEP 1： 修改 Maven Dependency

```markdown
   <dependency>
     <groupId>club.easy-utils</groupId>
     <artifactId>easy-weprogram</artifactId>
     <version>1.0</version>
   </dependency>
```

STEP 2：配置 Spring XML 文件用以扫描 @Service

```markdown
    <context:component-scan base-package="club.easyutils.weprogram.service.**.**"/>
```

STEP 3：重写配置类，注入AppID 和 AppSecret

```java
    @Service("tokenConfig")
    public class WechatTokenConfig implements TokenConfig {
    
        @Value("${store.bridge.wechat.app.id}")
        private String appId = "";
    
        @Value("${store.bridge.wechat.app.secret}")
        private String appSecret = "";
    
        @Override
        public String getAppId() {
            return appId;
        }
    
        @Override
        public String getAppSecret() {
            return appSecret;
        }
    }
```

## 项目开发计划

点击链接访问：[Easy Utils - Easy WeProgram 开发计划](https://www.yuque.com/easy-utils/easy-weprogram/ag5n53)

## 联系作者

+ 邮件：rainyblossom@163.com

    <img src="https://resource.rainyblossom.com/image/opensource/website/wechat-work.jpeg" width="30%">


    