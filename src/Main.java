public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport();

        transport.setName("Alan");
        transport.setSeatsNumber( -1 );

        System.out.println("Name: " + transport.getName());
        System.out.println("Seats number " + transport.getSeatsNumber());

        Car car = new Car();
        car.move();
        car.options();
    }
}