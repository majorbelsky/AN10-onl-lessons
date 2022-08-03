package lesson07.Part2;

public class Therapist extends Doctor {

    public Therapist() {
        super();
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Therapist measures blood pressure to " + patient.getName());
    }
}


