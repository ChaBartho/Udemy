public class PlaneteTellurique extends Planete implements Habitable{


    PlaneteTellurique(String nom) {
        super(nom);
    }


    public void accueillirVaisseau(Vaisseau vaisseau) {
        if (vaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)vaisseau).desactiverArmes();     //invoquer la méthode desactiverArmes + transtypage de la variable
        }
        totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
        if (vaisseauActuellementAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauActuellementAccoste.type + " doit s'en aller");
        }
        vaisseauActuellementAccoste = vaisseau;
    }
}
