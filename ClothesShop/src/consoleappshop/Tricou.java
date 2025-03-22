package consoleappshop;

class Tricou extends Product {

    public Tricou(String name, double price, Size size, String color, int quantity, Gender gender) {
        super(name, price, size, color , quantity, gender);
    }
    @Override
    public  String getCategory(){
        return  "Tricou";
    }
}
