package fr.diginamic.salaire;
/**
 * TP - Autonomie - Exercice CalculSalaire
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 08/10/2021
 */
public class Salarie extends Intervenant{
    private double salaireMensuel;

    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

}
