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

    public static void printComputerConfig (Computer computer) {
        System.out.println
                ("Computer " + computer.model +
                        ":\nRAM: " + computer.ram.name + " " + computer.ram.capacity +
                        "GB\nHDD: " + computer.hdd.name + " " + computer.hdd.capacity + "GB" +
                        (computer.hdd.isInternal ? " (internal)" : " (external)") +
                        "\nPrice: " + computer.price);
    }
}
