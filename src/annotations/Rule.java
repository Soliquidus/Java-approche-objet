package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TP 4 - Annotations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 18/10/2021
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Rule {
    int min() default Integer.MIN_VALUE;
}
