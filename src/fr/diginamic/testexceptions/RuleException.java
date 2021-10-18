package fr.diginamic.testexceptions;

/**
 * Class nombreException
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 18/10/2021
 */
public class RuleException extends Exception {
    //Pour gérer les erreurs de type null
    public RuleException(String message) {
        super(message);
    }
}