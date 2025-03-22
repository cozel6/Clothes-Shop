package consoleappshop;

class Bluza extends Product {

    public Bluza(String nume, double pret, Size marime, String culoare, int cantitate, Gender gen) {
        super(nume, pret, marime, culoare, cantitate, gen);
    }

    @Override
    public String getCategory() {
        return "Bluza";
    }
}
