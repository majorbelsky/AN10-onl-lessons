package lesson07.Part1;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " calling");
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + " " + number + " calling");
    }

    public void sendMessage(int...numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
