package consoleappshop;

class Incaltaminte extends Product {

    private final IncaltaminteTip tip;

    public Incaltaminte(String name, double price, Size size, String color, int quantity, Gender gender, IncaltaminteTip tip) {
        super(name, price, size, color, quantity, gender);
        this.tip = tip;
    }

    public IncaltaminteTip getTip() {
        return tip;
    }

    @Override
    public String getCategory() {
        return "Incaltaminte " + tip;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip: " + tip;
    }
}
