package consoleappshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n---- Meniu ----");
            System.out.println("1. Adaugă produs");
            System.out.println("2. Șterge produs");
            System.out.println("3. Actualizează produs");
            System.out.println("4. Aplică discount");
            System.out.println("5. Generează raport pe categorie");
            System.out.println("6. Filtrează produse");
            System.out.println("7. Afișează toate produsele");
            System.out.println("8. Ieșire");
            System.out.print("Alege opțiunea: ");
            
            int opt = sc.nextInt();
            sc.nextLine(); 
            
            switch (opt) {
                case 1:
                    // Adăugare produs
                    System.out.println("Tipuri de produse: 1. Tricou, 2. Bluza, 3. Pantalon, 4. Incaltaminte");
                    System.out.print("Alege tipul produsului: ");
                    int tipProdus = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nume: ");
                    String nume = sc.nextLine();

                    System.out.print("Preț: ");
                    double pret = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Mărime (XS, S, M, L, XL): ");
                    String marimeStr = sc.nextLine();
                    Size marime = Size.valueOf(marimeStr.toUpperCase());

                    System.out.print("Culoare: ");
                    String culoare = sc.nextLine();

                    System.out.print("Cantitate: ");
                    int cantitate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Gen (FEMAIN/MASCULIN): ");
                    String genStr = sc.nextLine();
                    Gender gen = Gender.valueOf(genStr.toUpperCase());
                    
                    Product p = null;
                    if (tipProdus == 1) {
                        p = new Tricou(nume, pret, marime, culoare, cantitate, gen);
                    } else if (tipProdus == 2) {
                        p = new Bluza(nume, pret, marime, culoare, cantitate, gen);
                    } else if (tipProdus == 3) {
                        System.out.print("Tip pantaloni (SCURT/LUNG): ");
                        String tipPant = sc.nextLine();
                        PantalonTip pt = PantalonTip.valueOf(tipPant.toUpperCase());
                        p = new Pantalon(nume, pret, marime, culoare, cantitate, gen, pt);
                    } else if (tipProdus == 4) {
                        System.out.print("Tip incaltaminte (SPORT/ELEGANTA): ");
                        String tipInc = sc.nextLine();
                        IncaltaminteTip it = IncaltaminteTip.valueOf(tipInc.toUpperCase());
                        p = new Incaltaminte(nume, pret, marime, culoare, cantitate, gen, it);
                    } else {
                        System.out.println("Tip produs invalid.");
                    }

                    if (p != null) {
                        inventory.addProduct(p);
                    }
                    break;

                case 2:
                    System.out.print("Numele produsului de șters: ");
                    String numeSterg = sc.nextLine();
                    inventory.removeProduct(numeSterg);
                    break;

                case 3:
                    System.out.print("Numele produsului de actualizat: ");
                    String numeActualizat = sc.nextLine();

                    System.out.print("Noul preț: ");
                    double nouPret = sc.nextDouble();

                    System.out.print("Noua cantitate: ");
                    int nouCantitate = sc.nextInt();
                    sc.nextLine();

                    inventory.updateProduct(numeActualizat, nouPret, nouCantitate);
                    break;

                case 4:
                    System.out.print("Numele produsului pentru discount: ");
                    String numeDiscount = sc.nextLine();

                    System.out.print("Tip discount (1 - primul discount, 2 - al doilea discount): ");
                    int tipDiscount = sc.nextInt();
                    sc.nextLine();

                    inventory.applyDiscountToProduct(numeDiscount, tipDiscount);
                    break;

                case 5:
                    System.out.print("Introdu categoria dorită (ex: Tricou, Bluza, 'Pantalon SCURT', 'Pantalon LUNG', 'Incaltaminte SPORT', 'Incaltaminte ELEGANTA'): ");
                    String categorie = sc.nextLine();
                    inventory.generateReportByCategory(categorie);
                    break;

                case 6:
                    System.out.print("Introdu filtrul (nume, preț, mărime, culoare, cantitate): ");
                    String filtru = sc.nextLine();
                    inventory.filterProducts(filtru);
                    break;

                case 7:
                    inventory.listAllProducts();
                    break;

                case 8:
                    // Ieșire
                    System.out.println("Ieșire...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opțiune invalidă.");
            }
        }
    }
}
