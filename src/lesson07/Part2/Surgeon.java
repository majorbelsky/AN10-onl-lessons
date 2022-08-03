package lesson07.Part2;

public class Surgeon extends Doctor {

    public Surgeon() {
        super();
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Surgeon doing an operation on " + patient.getName());
    }
}
