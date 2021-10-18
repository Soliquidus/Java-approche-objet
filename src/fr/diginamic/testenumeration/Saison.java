package fr.diginamic.testenumeration;

/**
 * TP 3 - Les Enumerations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @since 18 /10/2021
 */
public enum Saison {
    /**
     * Printemps saison.
     */
    PRINTEMPS(1, "Printemps"),
    /**
     * Ete saison.
     */
    ETE(2, "Eté"),
    /**
     * Automne saison.
     */
    AUTOMNE(3, "Automne"),
    /**
     * Hiver saison.
     */
    HIVER(4, "Hiver");

    private String saison;
    private int ordre;

    private Saison(int ordre, String saison){
        this.saison = saison;
        this.ordre = ordre;
    }

    /**
     * Gets saison.
     *
     * @return the saison
     */
    public String getSaison() {
        return saison;
    }

    /**
     * Sets saison.
     *
     * @param saison the saison
     */
    public void setSaison(String saison) {
        this.saison = saison;
    }

    /**
     * Gets ordre.
     *
     * @return the ordre
     */
    public int getOrdre() {
        return ordre;
    }

    /**
     * Sets ordre.
     *
     * @param ordre the ordre
     */
    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    /**
     * Méthode pour trouver la saison suivant un libellé donné.
     * @param libelle le libellé
     */
    public static void getInstanceSaison(String libelle){
        for(Saison saison : Saison.values()){
            if(saison.getSaison().equals(libelle)){
                System.out.println("Place dans l'ordre des saisons : " + saison.getOrdre() + ", Libellé : " + saison.getSaison());
            }
        }
    }
}
