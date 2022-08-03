package lesson07.Part2;

        /*
        Создать программу для имитации работы клиники.
        Пусть в клинике будет три врача: хирург, терапевт и дантист.
        Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
        Так же предусмотреть класс «Пациент» и класс «План лечения».
        Создать объект класса «Пациент» и добавить пациенту план лечения.
        Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */

import java.util.Scanner;

public class ClinicMainClass {
    public static void main(String[] args) {

        Patient patient = new Patient();
        TreatmentPlan plan = new TreatmentPlan();

        System.out.print("Enter patient name: ");
        Scanner scanner = new Scanner(System.in);
        patient.setName(scanner.nextLine());
        System.out.print("Enter patient treatment code: ");
        plan.setCode(scanner.nextInt());
        patient.setTreatmentPlan(plan);

        Doctor dentist = new Dentist();
        Doctor surgeon = new Surgeon();
        Doctor therapist = new Therapist();

        switch (plan.getCode()) {
            case 1 -> surgeon.treat(patient);
            case 2 -> dentist.treat(patient);
            default -> therapist.treat(patient);
        }
    }


}
