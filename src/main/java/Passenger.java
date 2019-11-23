public class Passenger {

    private String name;
    private int numberOfBags;
    private int bagWeight;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.bagWeight = 1;

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
