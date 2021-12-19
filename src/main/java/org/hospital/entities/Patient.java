package org.hospital.entities;

import java.util.List;

public class Patient {
    private Profile profile;
    private String status;
    private String diagnosis;
    private String treatments;
    private List<Therapist> therapists;

    public Patient(Profile profile, String status, String diagnosis, String treatments, List<Therapist> therapists) {
        super();
        this.profile = profile;
        this.status = status;
        this.diagnosis = diagnosis;
        this.treatments = treatments;
        this.therapists = therapists;
    }

    public Patient() {
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }

    public List<Therapist> getTherapists() {
        return therapists;
    }

    public void setTherapists(List<Therapist> therapists) {
        this.therapists = therapists;
    }

    @Override
    public String toString() {
        return "Patient [profile=" + profile + ", status=" + status + ", diagnosis=" + diagnosis + ", treatments="
                + treatments + ", therapists=" + therapists + "]";
    }

}
