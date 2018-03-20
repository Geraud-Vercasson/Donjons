package donjon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Guerrier[] guerriers = new Guerrier[10];
        Magicien[] magiciens = new Magicien[10];
        int guerrierIndex = 0, magicienIndex = 0;
        int choix, choixModif;
        do {
            //Menu Principal
            do {
                System.out.println("Bienvenue dans le menu de Donjons & Javons\n" +
                        "\n" +
                        "1. Créer un personnage\n" +
                        "2. Modifier un personnage" +
                        "3. Quitter");

                choix = input.nextInt();
                if (choix == 1) {
                    System.out.println("Vous voulez créer un guerrier ou un magicien?\n" +
                            "1. Guerrier\n" +
                            "2. Magicien");
                    choix = input.nextInt();
                    input.nextLine();
                    if (choix == 1 && guerrierIndex < 10) {

                        guerriers[guerrierIndex] = createGuerrier();
                        System.out.println("Ok! Tu viens de créer ton personnage!");
                        System.out.println(guerriers[guerrierIndex].toString());

                        guerrierIndex++;

                    } else if (choix == 2 && magicienIndex < 10) {

                        magiciens[magicienIndex] = createMagicien();
                        System.out.println("Ok! Tu viens de créer ton personnage!");
                        System.out.println(magiciens[magicienIndex].toString());

                        magicienIndex++;
                    }
                } else if (choix == 2){
                    System.out.println("Liste des personnages");
                    int i = 0, j = 0;
                    if (guerrierIndex > 0){
                        System.out.println("Guerriers :");
                        for(i = 0; i < guerrierIndex; i++){
                            System.out.println(i + ". :" + guerriers[i].getNom());
                        }
                    }
                    if (magicienIndex > 0){
                        System.out.println("Magiciens :");
                        for(j = 0; j < magicienIndex; j++){
                            System.out.println((i+j) + ". :" + magiciens[j].getNom());
                        }
                    }
                    System.out.println("Personnage à modifier");
                    choixModif = input.nextInt();
                    if (choixModif < guerrierIndex){
                        guerriers[choixModif].modifier();
                    } else if (choixModif < guerrierIndex + magicienIndex){
                        choixModif -= guerrierIndex;
                        magiciens[choixModif].modifier();
                    }
                }

            }while (choix != 1 && choix != 2 && choix != 3);

        } while (choix != 3);
    }

    private  static Guerrier createGuerrier(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quel nom a-t-il ?");
        String nom = input.nextLine();
        System.out.println("Quelle est son image ?");
        String image = input.nextLine();
        System.out.println("Ses PV ?");
        int pv = input.nextInt();
        System.out.println("Sa force ?");
        int force = input.nextInt();
        System.out.println("Son bouclier ?");
        int bouclier = input.nextInt();

        return new Guerrier(nom,image,pv,force,bouclier);

    }

    private static Magicien createMagicien(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quel nom a-t-il ?");
        String nom = input.nextLine();
        System.out.println("Quelle est son image ?");
        String image = input.nextLine();
        System.out.println("Ses PV ?");
        int pv = input.nextInt();
        System.out.println("Sa puissance ?");
        int puissance = input.nextInt();
        System.out.println("Son philtre ?");
        int philtre = input.nextInt();

        return new Magicien(nom,image,pv,puissance,philtre);
    }
}
