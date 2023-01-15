public abstract class Planete {
    //Propriétés:
    String nom;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAccoste;
    static String forme = "sphérique";
    static int nbPlanetesDecouvertes;

    //Constructeur :
    Planete(String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    //Méthodes:
    int rotation(int angle){
        return angle/360;
    }
    int revolution(int angle){
        return angle/360;
    }

    static String expansion(double distance){
        if(distance < 14) {
            return "Oh la la mais c'est super rapide !";
        }else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }





}