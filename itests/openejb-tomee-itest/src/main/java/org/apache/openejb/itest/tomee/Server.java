package org.apache.openejb.itest.tomee;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE })
@Retention(RUNTIME)
public @interface Server {
    String name() default ""; // name
    String configurationDir() default "";
    int http() default -1;
    int shutdown() default -1;
    int ajp() default -1;
    Class<? extends ServerTweaker> tweaker() default SimpleTweaker.class;
    boolean cleanWebapp() default true;
    Artifact artifact() default @Artifact;
}