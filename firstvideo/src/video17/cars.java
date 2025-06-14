package video17;

public class cars {
    int speed;
    String model;

    public static void main(String[] args) {
        cars   type  = new cars();

        type.speed=500;
        type.model="volvo";
        type.print();


        type.speed=400;
        type.model="bmw";
        type.print();


    }
     static void print() {System.out.println("the car's type is:");}

}
