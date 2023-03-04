public class Transport {

    private String name;
    private int seatsNumber;


    // public method move
    public void move() {
        System.out.println("transport is moving.");
    }

    // public method options
    public void options(){
        System.out.println("I can move back and forward.");
    }

    //constructor without initialization fields
    public Transport() {
        System.out.println("Object Transport created");
    }

    // getters and setters for class fields
    public String getName() {
        return name;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    //value control for setSeatsNumber
    public void setSeatsNumber(int seatsNumber){
        if (seatsNumber <= 0) {
            System.out.println("Number of seats cannot be negative!");
        } else {
            this.seatsNumber = seatsNumber;
        }
    }

}

