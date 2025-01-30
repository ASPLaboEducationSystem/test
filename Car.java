public class Car{
    private String name;
    private String color;
    private int price;
    public Car(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
}