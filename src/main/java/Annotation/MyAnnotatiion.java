package Annotation;

/**
 * @author WarmCongee
 * @date 2022/4/9 11:49
 */
public @interface MyAnnotatiion {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
