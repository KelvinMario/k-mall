package com.kelvin.common.annotation;

import com.kelvin.common.enums.BusinessType;
import com.kelvin.common.enums.OperatorType;

import java.lang.annotation.*;

/**
 * @author Ke1vin7
 * @since 2022/7/14 14:01
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

    /**
     * 模块名
     * @return
     */
    String title() default "";

    /**
     * 功能名
     * @return
     */
    BusinessType businessType() default BusinessType.OTHER;

    /**
     * 操作人类别
     * @return
     */
    OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * 是否保存请求参数
     * @return
     */
    boolean isSaveRequestData() default true;

    /**
     * 是否保存响应参数
     * @return
     */
    boolean isSaveResponseData() default true;

}
