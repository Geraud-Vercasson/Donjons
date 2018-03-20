package donjon;

import java.util.Scanner;

public class Magicien {
    private String nom;
    private String image;
    private int pv;
    private int force;
    private int philtre;
    private Sort[] sorts;

    public Magicien(){
    }

    /**
     *
     * @param newNom
     * @param newImage
     * @param newPv
     * @param newForce
     * @param newPhiltre
     */
    public  Magicien(String newNom, String newImage, int newPv, int newForce, int newPhiltre){
        this.setNom(newNom);
        this.setImage(newImage);
        this.setPv(newPv);
        this.setForce(newForce);
        this.setPhiltre(newPhiltre);
    }

    public int getPhiltre() {
        return philtre;
    }

    public void setPhiltre(int philtre) {
        this.philtre = philtre;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }


    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        if (pv < 0) {
            this.pv = 0;
        } else if (pv >100){
            this.pv = 100;
        } else {
            this.pv = pv;
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Magicien modifier(){
        Scanner input = new Scanner(System.in);
        int choix;
        do {
            System.out.println("Modification de " + this.nom + "\n" +
                    "1. Nom\n" +
                    "2. Image\n" +
                    "3. PV\n" +
                    "4. Force\n" +
                    "5. Bouclier\n" +
                    "6. Quitter\n");

            choix = input.nextInt();
            input.nextLine();
            if (choix == 1){
                System.out.println("Nouveau Nom :");
                this.setNom(input.nextLine());
            } else if (choix == 2){
                System.out.println("Nouvelle Image :");
                this.setImage(input.nextLine());
            } else if (choix == 3){
                System.out.println("Nouveau PV:");
                this.setPv(input.nextInt());
            } else if (choix == 4){
                System.out.println("Nouvelle Force :");
                this.setForce(input.nextInt());
            } else if (choix == 5) {
                System.out.println("Nouveau Philtre :");
                this.setPhiltre(input.nextInt());
            }

        } while (choix != 6);
        return this;
    }

}
