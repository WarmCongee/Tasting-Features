package Annotation;

import java.lang.annotation.*;

/**
 * @author WarmCongee
 * @date 2022/4/9 11:49
 */
/** 表示该注解作用于何时*/
@Retention(RetentionPolicy.RUNTIME)
/** 表示该注解作用于什么对象，可以通过花括号输入有多个参数*/
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
@Documented
public @interface MyAnnotatiion {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
