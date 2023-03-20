package Activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres = 4;
        doors= 4;
    }
    public void displayCharacteristics(){
        System.out.println("Car Color "+color);
        System.out.println("Car Transmission "+transmission);
        System.out.println("Car Make is  "+make);
        System.out.println("Tyres of car are  "+tyres);
        System.out.println("Doors of Car are  "+doors);


    }
    public void accelerate(){

        System.out.println("Car is moving Forward");
    }
    public void brake(){
        System.out.println("Car is stopped");
    }

}
