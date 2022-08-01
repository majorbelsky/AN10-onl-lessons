package lesson06.Part2;

public class ComputerMainClass {
    public static void main(String[] args) {
        Computer computer1 = new Computer(300, "Dell");
        computer1.printComputerConfig();

        System.out.println();

        RAM computer2ram = new RAM("Nec", 16);
        HDD computer2hdd = new HDD("Seagate", 512, false);
        Computer computer2 = new Computer(500, "HP", computer2ram, computer2hdd);
        computer2.printComputerConfig();
    }
}
