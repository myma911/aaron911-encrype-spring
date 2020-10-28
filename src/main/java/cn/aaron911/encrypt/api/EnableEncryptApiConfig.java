package cn.aaron911.encrypt.api;

import cn.aaron911.encrypt.api.property.EncryptProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.aaron911.encrypt.api.advice.DecryptRequestBodyAdvice;
import cn.aaron911.encrypt.api.advice.EncryptResponseBodyAdvice;

/**
 * spring 中使用接口加密解密
 * 
 */
@Configuration
@Import({EncryptProperty.class,
    EncryptResponseBodyAdvice.class,
    DecryptRequestBodyAdvice.class})
public class EnableEncryptApiConfig {

}
