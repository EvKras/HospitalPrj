package org.hospital.DAO;

public class DBinput {

    public static void Therapistinput(String name, String surname, String role) {

        String insertTableSQL = "INSERT INTO THERAPISTS"
                + "(Name, Surname, Role) " + "VALUES"
                + name + surname + role;
    }

    public static void Profileinput(String name, String surname, String sex, int age) {
        String insertTableSQL = "INSERT INTO PROFILE"
                + "(Name, Surname, Sex, Age) " + "VALUES"
                + name + surname + sex + age;
    }

    public static void Patientinput(String status, String diagnosis, String treatments) {
        String insertTableSQL = "INSERT INTO PATIENTS"
                + "(Status, Diagnosis, Treatments) " + "VALUES"
                + status + diagnosis + treatments;
    }

    public static void Hospitalinput(String description) {
        String insertTableSQL = "INSERT INTO HOSPITAL"
                + "(description) " + "VALUES"
                + description;
    }
}
