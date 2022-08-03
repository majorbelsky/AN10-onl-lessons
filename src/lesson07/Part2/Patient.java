package lesson07.Part2;

public class Patient {
    private TreatmentPlan treatmentPlan;
    private String name;


    public Patient() {
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}