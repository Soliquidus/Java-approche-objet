package utils;

/**
 * TP4 qui présente quelques fonctions utiles intégrées à Java
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 07/10/2021
 */

public class ConversionNombre {
    public static void main(String[] args) {
        String chaine = "12";
        int chaineConvertie = Integer.parseInt(chaine);
        System.out.println(chaineConvertie);

        int a = 1021657;
        int b = 1021660;

        System.out.println(Integer.max(a, b));
    }
}
