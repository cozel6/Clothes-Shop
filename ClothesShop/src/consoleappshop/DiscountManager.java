package consoleappshop;

class DiscountManager {

    public static void applyFirstDiscount(Product p) {
        // Aplicăm discount de 10% dacă stocul este mai mic de 30
        if (p.getQuantity() < 30) {
            double discount = 0.10;
            double newPrice = p.getPrice() * (1 - discount);
            p.setPrice(newPrice);
            System.out.println("S-a aplicat discount de 10% pentru " + p.getName());
        } else {
            System.out.println("Nu se poate aplica primul discount, stocul este suficient.");
        }
    }

    public static void applySecondDiscount(Product p) {
        // Aplicăm discount de 20% dacă stocul este mai mic de 10
        // și noul preț nu trebuie să fie mai mic de jumătate din prețul inițial
        if (p.getQuantity() < 10) {
            double discount = 0.20;
            double proposedPrice = p.getPrice() * (1 - discount);
            if (proposedPrice >= p.getOriginalPrice() / 2) {
                p.setPrice(proposedPrice);
                System.out.println("S-a aplicat discount suplimentar de 20% pentru " + p.getName());
            } else {
                System.out.println("Discountul nu poate fi aplicat deoarece noul preț ar fi mai mic de jumătate din prețul inițial.");
            }
        } else {
            System.out.println("Nu se poate aplica al doilea discount, stocul este prea mare.");
        }
    }
}
