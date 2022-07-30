package lesson06.Part2;

public class HDD {
    String name;
    int capacity;
    boolean isInternal;

    public HDD() {
        this.name = "Samsung";
        this.capacity = 256;
        this.isInternal = true;
    }

    public HDD(String name, int capacity, boolean isInternal) {
        this.name = name;
        this.capacity = capacity;
        this.isInternal = isInternal;
    }
}
