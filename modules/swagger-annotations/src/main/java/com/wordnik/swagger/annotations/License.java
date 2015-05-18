package com.wordnik.swagger.annotations;

public @interface License {
    String value() default "";

    /**
     * URL for the license.
     */
    String url() default "";
}
