package annotationdemo;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface CustomAnno {
	String str() default "This is a custom annotation.";
	int val() default 01;
	int test =100;
	String customAnnoDescriptor() default "This describes custom anntation.";
}