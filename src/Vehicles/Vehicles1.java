package Vehicles;

public enum Vehicles1 {

    CAR (15000,  "Red"), BUS (50000,  "Blue"),
    BIKE (1200,  "Black"), KICKSCOOTER (200,  "White");

    private int price;
    public String colour;


    Vehicles1 (int price, String colour) {this.price=price; this.colour =colour; }
    public int getPrice() {return price; }
    public String getColour() {return colour;}

    public String toString() {
        return price + " Цена транспорта " + colour + " Цвет транспорта ";  }









}
