package utils;

import annotations.ToString;
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
public class StringUtils {
    public static void afficherAttributs(Object obj) throws ReflectionsException, IllegalAccessException, IllegalArgumentException {
        StringBuilder valeur = new StringBuilder();

        if(obj == null){
            throw new ReflectionsException("L'objet ne doit pas être vide.");
        }

        Class<?> classe = obj.getClass();
        Field[] attributs = classe.getDeclaredFields();

        for(Field attribut : attributs){
            attribut.setAccessible(true);
            if(attribut.isAnnotationPresent(ToString.class)){
                ToString annotation = attribut.getAnnotation(ToString.class);
                boolean upperCase = annotation.upperCase();
                String separateur = annotation.separateur();

                if(attribut.isAnnotationPresent(ToString.class)) {
                    if (upperCase) {
                        valeur.append(attribut.get(obj).toString().toUpperCase()).append(" ");
                    } else {
                        valeur.append(attribut.get(obj).toString()).append(" ");
                    }

                    if (!separateur.isEmpty()) {
                        valeur.append(separateur).append(" ");
                    }
                }
            }
        }
        System.out.println(valeur);
    }
}