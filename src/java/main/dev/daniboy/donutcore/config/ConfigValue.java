package dev.daniboy.donutcore.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface ConfigValue {
    String path() default "";
    
    String[] comments() default {};
    
    boolean inline() default false;
}
