public class Car extends Transport{

    private int vipNumber;
    private int stateNumber;

    public void car() {
    }

    public int getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(int vipNumber) {
        this.vipNumber = vipNumber;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

