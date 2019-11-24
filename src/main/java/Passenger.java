public class Passenger {

    private String name;
    private int numberOfBags;
    private int bagWeight;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.bagWeight = 1;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBags(){
        return this.numberOfBags;
    }

    public int passengerWeight() {
        return this.numberOfBags * this.bagWeight;
    }

}
