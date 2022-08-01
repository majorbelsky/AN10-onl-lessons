package lesson06.Part2;

public class Computer {

    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printComputerConfig () {
        System.out.println
                ("Computer " + this.model +
                        ":\nRAM: " + this.ram.name + " " + this.ram.capacity +
                        "GB\nHDD: " + this.hdd.name + " " + this.hdd.capacity + "GB" +
                        (this.hdd.isInternal ? " (internal)" : " (external)") +
                        "\nPrice: " + this.price);
    }
}
