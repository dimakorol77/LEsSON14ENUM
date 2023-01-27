package Vehicles;

public class Main {

    public static void main(String[] args) {
        Vehicles1 vehicles1 = Vehicles1.CAR;
        System.out.println(vehicles1.name() + vehicles1.toString());

        Vehicles1 vehicles2 = Vehicles1.KICKSCOOTER;
        System.out.println(vehicles2.name() + vehicles2.toString());

        Vehicles1 vehicles3 = Vehicles1.BIKE;
        System.out.println(vehicles3.name() + vehicles3.toString());

        Vehicles1 vehicles4 = Vehicles1.BUS;
        System.out.println(vehicles4.name() + vehicles4.toString());

    }

}