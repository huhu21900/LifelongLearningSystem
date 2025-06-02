package com.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}
