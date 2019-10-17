package com.example.web.annotation;


import java.lang.annotation.*;

import com.example.web.enums.DataSourceEnum;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.DB1;
}
