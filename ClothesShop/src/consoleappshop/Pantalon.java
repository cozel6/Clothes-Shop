package consoleappshop;

class Pantalon extends  Product {

    private final PantalonTip tip;

    public Pantalon(String name, double price, Size size, String color, int quantity, Gender gender, PantalonTip tip) {
        super(name, price, size, color, quantity, gender);
        this.tip = tip;
    }

    public PantalonTip getTip() {
        return tip;
    }

    @Override 
    public String getCategory(){
        return "Pantalon" + tip;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip: " + tip;
    }

}
