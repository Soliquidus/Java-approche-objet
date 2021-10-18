package sets;

import annotations.Rule;
import annotations.ToString;
import annotations.Validator;
import fr.diginamic.testexceptions.ReflectionsException;
import fr.diginamic.testexceptions.RuleException;


/**
 * TP 11 - Apprendre à utiliser Set et HashSet
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 13/10/2021
 */
public class Pays implements Comparable {
//    Exercice 3 - Voir aussi classe TestPays
//    TP4 - Annotations
    /**
     * Attributs
     */
    @ToString(separateur = "->", upperCase = true)
    String nom;

    @Rule(min = 0)
    @ToString(separateur = "habitants,")
    long habitants;

    @ToString(separateur = "$ de PIB/habitants")
    double pibHabitant;

    /**
     * Constructeur
     * @param nom
     * @param habitants
     * @param pibHabitant
     */
    public Pays(String nom, long habitants, double pibHabitant) throws RuleException,IllegalArgumentException, IllegalAccessException, ReflectionsException {
        this.nom = nom;
        this.habitants = habitants;
        this.pibHabitant = pibHabitant;
        Validator.valider(this);
    }

    /**
     * Getter de nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de habitants
     * @return habitants
     */
    public long getHabitants() {
        return habitants;
    }

    /**
     * Setter de habitants
     * @param habitants
     */
    public void setHabitants(long habitants) {
        this.habitants = habitants;
    }

    /**
     * Getter du Pib/habitants
     * @return pibHabitant
     */
    public double getPib() {
        return pibHabitant;
    }

    /**
     * Setter du Pib/habitants
     * @param pibHabitant
     */
    public void setPib(double pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

    public int calculerPibTotal(){
        return (int) (this.pibHabitant * this.habitants);
    }

    /**
     * Méthode hérité de l'interface Comparable et adapté à l'exercice 3
     * @param pays
     * @return triAscendant
     */
    @Override
    public int compareTo(Object pays) {
        double comparePib = ((Pays)pays).getPib();
        return (int) (this.pibHabitant-comparePib);
    }

}
