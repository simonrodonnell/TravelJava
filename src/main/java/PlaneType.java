public enum PlaneType {
    BOEING747(10, 10),
    BOEING767(15, 15),
    BOEING777(20, 20),
    BOEING787(30, 30),
    AIRBUSA310(10, 10),
    AIRBUSA330(15, 15),
    AIRBUSA340(20, 20),
    AIRBUSA350(25, 25),
    AIRBUSA380(30, 30);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }

}
