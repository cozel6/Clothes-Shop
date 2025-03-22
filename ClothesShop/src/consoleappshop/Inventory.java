package consoleappshop;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Produs adăugat: " + p.getName());
    }

    public void removeProduct(String name) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Produsul " + name + " a fost șters.");
        } else {
            System.out.println("Produsul " + name + " nu a fost găsit.");
        }
    }

    public void updateProduct(String name, double newPrice, int newQuantity) {
        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setPrice(newPrice);
                p.setQuantity(newQuantity);
                System.out.println("Produsul " + name + " a fost actualizat.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Produsul " + name + " nu a fost găsit.");
        }
    }

    public void applyDiscountToProduct(String name, int discountType) {
        // discountType: 1 pentru primul discount, 2 pentru al doilea discount
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (discountType == 1) {
                    DiscountManager.applyFirstDiscount(p);
                } else if (discountType == 2) {
                    DiscountManager.applySecondDiscount(p);
                } else {
                    System.out.println("Tip de discount invalid.");
                }
                return;
            }
        }
        System.out.println("Produsul " + name + " nu a fost găsit.");
    }

    public void generateReportByCategory(String category) {
        System.out.println("Produsele din categoria: " + category);
        boolean found = false;
        for (Product p : products) {
            // Comparam ignorând majusculele
            if (p.getCategory().equalsIgnoreCase(category)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nu există produse în categoria " + category);
        }
    }

    public void filterProducts(String filter) {
        // Filtrare după nume, preț, culoare, mărime, cantitate
        System.out.println("Rezultatele filtrării pentru: " + filter);
        boolean found = false;
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(filter.toLowerCase()) ||
                String.valueOf(p.getPrice()).contains(filter) ||
                p.getColor().toLowerCase().contains(filter.toLowerCase()) ||
                p.getSize().toString().toLowerCase().contains(filter.toLowerCase()) ||
                String.valueOf(p.getQuantity()).contains(filter)) 
            {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Niciun produs găsit pentru filtrul dat.");
        }
    }

    public void listAllProducts() {
        System.out.println("Lista completă a produselor:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
