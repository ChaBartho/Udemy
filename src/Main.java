import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur=new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers = 5;
        Vaisseau fregate=new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 6;
        Vaisseau croiseur=new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 7;
        Vaisseau cargo=new VaisseauCivil("CARGO");
        cargo.nbPassagers = 8;
        Vaisseau vaisseauMonde=new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 9;

//        Scanner scan = new Scanner(System.in);
//        System.out.print("1) Quel vaisseau il souhaite manipuler parmi les 5 précédemment créés en indiquant le type du vaisseau : ");
//        String vaiseauChoisi = scan.nextLine();
//        System.out.println("Votre vaiseau choisi est : "+vaiseauChoisi);
//        Vaisseau vaisseau = null;
//
//        System.out.print("2) Sur quelle planète tellurique il souhaite se poser en indiquant le nom de la planète : ");
//        String planeteChoisie = scan.nextLine();
//        System.out.println("Votre planète choisie est : "+planeteChoisie);
//
//        System.out.print("3) Quelle tonnage de cargaison il souhaite embarquer : ");
//        int tonnageChoisi = scan.nextInt();
//        System.out.println("Votre tonnage choisi est : "+tonnageChoisi);
//
//        PlaneteTellurique planete = null;
//        planete.accueillirVaisseau(vaisseau);
//        int rejet = vaisseau.emporterCargaison(tonnageChoisi);
//        System.out.print("le rejet est de : "+rejet);

//        Atmosphere atmosphereUranus = new Atmosphere();
//        atmosphereUranus.hydrogene= 83F;
//        atmosphereUranus.helium=15F;
//        atmosphereUranus.methane=2.5f;
//        atmosphereUranus.azote=0.0F;
//        uranus.atmosphere =atmosphereUranus;



        int[] tableauDeInt = new int[5];
        char[] tableauDeChar = new char[5];
        String[] tableauDeString = new String[5];
        Voiture[] tableauDeVoiture = new Voiture[5];

        tableauDeInt[0] = 5;
        tableauDeInt[1] = 10;
        tableauDeInt[2] = 15;
        tableauDeInt[3] = 20;
        tableauDeInt[4] = 25;

        System.out.println(tableauDeInt[0]);

        tableauDeChar[0] = 'a';
        tableauDeString[0] = "Sushi";
















/*
        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.nbPortes=3;
        voitureDeMichel.automatique=true;
        voitureDeMichel.couleur="verte";
        System.out.println("La voiture de Michel est "+voitureDeMichel.couleur+" et elle dispose de "+voitureDeMichel.nbPortes+" portes.");

        voitureDeMichel.klaxonnner();

        int nouvelleVitesse=voitureDeMichel.accelerer();        //declaration variable
        System.out.println("Nouvelles vitesse: "+nouvelleVitesse);

        int nouveauRapport = voitureDeMichel.passerRapport(true);       //declaration variable
        System.out.println("Le nouveau rapport est "+nouveauRapport);

        voitureDeMichel.passerRapport(true);
        voitureDeMichel.passerRapport(true);
        nouveauRapport = voitureDeMichel.passerRapport(false);          //déjà déclarée donc pas mettre type MAIS réaffection
        System.out.println("Le nouveau rapport est "+nouveauRapport);


        Voiture voitureDeJerome = new Voiture();  //instanciation de voitureDeJerome
        voitureDeJerome.nbPortes=5;
        Moteur engine = new Moteur();  //instanciation de engine
        engine.carburation = "Diesel";
        engine.nbCylindres = 6;
        voitureDeJerome.engine = engine;
        System.out.println("Le nombres de cylindres de la voiture de Jérome est "+voitureDeJerome.engine.nbCylindres);


        Passager passenger = new Passager();
        passenger.nom="Dupont";
        passenger.prenom="Vincent";
        Ville auckland = new Ville();
        auckland.nom = "Auckland";

        Ville destination = voitureDeMichel.transporter(passenger, auckland);
        System.out.println("Le passager est arrivé dans la ville de "+destination.nom);
*/



    }
}
