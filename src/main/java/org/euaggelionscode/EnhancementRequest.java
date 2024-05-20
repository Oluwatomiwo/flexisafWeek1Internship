package org.euaggelionscode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnhancementRequest {
    int id();
    String synopsis();
    String engineer() default "Unassigned";
    String date() default "Unknown";
}
