package org.hospital.entities;

import java.util.List;

public class Hospital {
    private String description;
    private List<Patient> patients;

    public Hospital(String description, List<Patient> patients) {
        super();
        this.description = description;
        this.patients = patients;
    }

    public Hospital() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Hospital [description=" + description + ", patients=" + patients + "]";
    }

}
