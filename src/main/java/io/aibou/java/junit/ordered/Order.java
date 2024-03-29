package io.aibou.java.junit.ordered;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by aibou on 2014/01/22.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Order {
	public Priority value();
}
