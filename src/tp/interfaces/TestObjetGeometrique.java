package tp.interfaces;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(180.58D);
        Rectangle rectangle = new Rectangle(95, 60);
        ObjetGeometrique [] objetsGeometriques = {cercle, rectangle};

        for(ObjetGeometrique objetGeometrique : objetsGeometriques){
            System.out.println(objetGeometrique);
        }

    }
}
