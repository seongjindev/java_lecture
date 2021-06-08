package OOP;

public class Bicycle {

    public String name;
    public String color;
    public int price;

    public Bicycle() {
        System.out.println("Bicycle");
    }
    public Bicycle(String name) {
        this.name = name;
        System.out.println("Bicycle name = " + name);
    }

    public void info(){
        System.out.println("info()");
        System.out.println("color = "+color);
        System.out.println("price = "+price);
        System.out.println("name = "+name);
    }
}
