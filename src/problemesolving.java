import java.util.Scanner;
void  main(){

    Scanner scaner = new Scanner(System.in);


    int units = scaner.nextInt();

    double montant = 0.0;

    if (units <= 100) {
        montant = units * 0.8;
    } else if (units <= 300) {
        montant = (100 * 0.8) + ((units - 100) * 1.2);
    } else {
        montant = (100 * 0.8) + (200 * 1.2) + ((units - 300) * 1.5);
    }

    double taxe = montant * 0.10;
    double total = montant + taxe;


    System.out.println("facture avant taxe:" +montant+ "MAD");
    System.out.println("taxe(10%):" +taxe+ "MAD");
    System.out.println("facture total:" +total+ "MAD");
}

