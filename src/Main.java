import java.util.Scanner;

void main(){
    //Scanner input = new Scanner(System.in);
   // System.out.println("Entrer nom ");
    //String nom  = input.next();
    //System.out.println("Bonjour, Sara ! " + nom);

    //Scanner input = new Scanner(System.in);
   // System.out.println("Entrer un nombre ");
   // int nombre  = input.nextInt();
   // for(int i=0 ;i<=nombre; i++) {
        ;
     //   System.out.println(i);

    Scanner input = new Scanner(System.in);
    double solde = 1000.00;
    String chooce ;
    while (true) {
        System.out.println("Entrer votre choix : ");
        chooce = input.next();
        switch (chooce) {
            case "1":
                System.out.println(solde);
                break;
            case "2":
                System.out.println("Entrer un montant : ");
                double salaire = input.nextDouble();
                double total = solde + salaire;
                System.out.println(total);
                break;
            case "3":
                System.out.println("Entrer un montant : ");
                double salaireRetrait = input.nextDouble();
                double totalSalaire = solde - salaireRetrait;
                System.out.println(totalSalaire);
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Le choix n'est pa exists.");
        }
    }
    }







