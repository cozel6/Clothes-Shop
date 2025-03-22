package consoleappshop;


abstract class Product {

    protected String name;
    protected double  price;
    protected double originalPrice;
    protected Size size;
    protected String color;
    protected int quantity;
    protected Gender gender;

    public Product(String name, double price,Size size, String color, int quantity, Gender gender) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Numele nu poate fi gol!");
        }

        if(price < 0  || quantity < 0){
            throw new IllegalArgumentException("Pretul si canitatea nu pot fi negative");
        }
        this.name = name;
        this.price = price;
        this.originalPrice = price; // prețul inițial
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.gender = gender;
    }

    //getter
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getOriginalPrice() { return originalPrice; }
    public Size getSize() { return size; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }
    public Gender getGender() { return gender; }
    
    //setter
    public void setPrice(double  price){
        if(price < 0){
            throw new IllegalArgumentException("Prețul nu poate fi negativ!");
        }
        this.price = price;
    }
    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Cantitatea nu poate fi negativ!");
        }
        this.quantity = quantity;
    }

    public abstract String getCategory();

    @Override
    public String toString(){
        return "Produs: " + name + ", Preț: " + price + ", Mărime: " + size + ", Culoare: " + color 
                + ", Cantitate: " + quantity + ", Gen: " + gender;
    }
}
