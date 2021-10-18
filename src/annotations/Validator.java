package annotations;

import fr.diginamic.testexceptions.ReflectionsException;
import fr.diginamic.testexceptions.RuleException;

import java.lang.reflect.Field;

/**
 * TP 4 - Annotations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 18/10/2021
 */
public class Validator {
    public static void valider(Object obj) throws RuleException, IllegalArgumentException, ReflectionsException, IllegalAccessException {
        if (obj == null) {
            throw new ReflectionsException("L'objet ne peut pas être null.");
        }

        Class<?> classe = obj.getClass();
        Field[] attributs = classe.getDeclaredFields();
        for (Field attribut : attributs) {
            attribut.setAccessible(true);
            if (attribut.isAnnotationPresent(Rule.class)) {
                Rule annotation = attribut.getAnnotation(Rule.class);
                int min = annotation.min();
                if (min >= Integer.parseInt(attribut.get(obj).toString())) {
                    throw new RuleException("Le nombre d'habitans doit être supérieur à 0.");
                }
            }
        }
    }
}
