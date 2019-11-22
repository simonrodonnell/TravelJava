public enum PlaneType {
    BOEING747(10, 20),
    BOEING767(15, 30),
    BOEING777(20, 40),
    BOEING787(30, 60),
    AIRBUSA310(10, 20),
    AIRBUSA330(15, 30),
    AIRBUSA340(20, 40),
    AIRBUSA350(25, 50),
    AIRBUSA380(30, 60);

    private final int capacity;
    private final int weightAllowance;

    PlaneType(int capacity, int weightAllowance){
        this.capacity = capacity;
        this.weightAllowance = weightAllowance;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeightAllowance(){
        return this.weightAllowance;
    }

}
