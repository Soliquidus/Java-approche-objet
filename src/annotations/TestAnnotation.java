package annotations;

import fr.diginamic.testexceptions.ReflectionsException;
import fr.diginamic.testexceptions.RuleException;
import sets.Pays;
import utils.StringUtils;

import java.util.HashSet;

/**
 * TP 4 - Annotations
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 18/10/2021
 */
public class TestAnnotation {
    public static void main(String[] args) throws RuleException, ReflectionsException, IllegalAccessException {
        Pays usa = null;
        try {
            usa = new Pays("USA", 331_002_651, 1.7974);
        } catch (RuleException e){
            e.printStackTrace();
        }

        Pays france = null;
        try {
            france = new Pays("France", 65_273_511, 6.6720);
        } catch (RuleException e){
            e.printStackTrace();
        }

        Pays allemagne = null;
        try {
            allemagne = new Pays("Allemagne", 83_783_942, 5.9923);
        } catch (RuleException e){
            e.printStackTrace();
        }

        Pays uk = null;
        try {
            uk = new Pays("UK", 67_886_011, 6.2765);
        } catch (RuleException e){
            e.printStackTrace();
        }

        Pays italie = null;
        try {
            italie = new Pays("Italie", 60_461_826, 6.3461);
        } catch (RuleException e){
            e.printStackTrace();
        }

        HashSet<Pays> paysHash = new HashSet<>();
        paysHash.add(usa);
        paysHash.add(france);
        paysHash.add(allemagne);
        paysHash.add(uk);
        paysHash.add(italie);

        for (Pays pays : paysHash){
            StringUtils.afficherAttributs(pays);
        }
    }
}