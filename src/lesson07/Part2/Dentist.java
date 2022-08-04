package lesson07.Part2;

public class Dentist extends Doctor{

    public Dentist() {
        super();
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Dentist drills a tooth to " + patient.getName());
    }
}
