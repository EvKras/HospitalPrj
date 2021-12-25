package org.hospital;

import org.hospital.DAO.DBinput;
import org.hospital.dbconnection.Connector;
import org.hospital.entities.Hospital;
import org.hospital.entities.Patient;
import org.hospital.entities.Profile;
import org.hospital.entities.Therapist;
import org.hospital.utils.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        List<Therapist> therapists = new ArrayList<Therapist>();
        List<Profile> profiles = new ArrayList<Profile>();
        List<Patient> patients = new ArrayList<Patient>();
        List<Hospital> hospitals = new ArrayList<Hospital>();
        File file = new File("3.hospital.json");
        Hospital hospital = JSONParser.parseFileToHospital(file);
        //Patient patient = JSONParser.parseFileToHospital(file);

        System.out.println(hospital.toString());
        //System.out.println(patient.toString);

        Connector connector = Connector.Cnt();
        therapists.forEach((therapist) -> DBinput.Therapistinput(therapist.getName(), therapist.getSurname(), therapist.getRole()));
        profiles.forEach((profile) -> DBinput.Profileinput(profile.getName(), profile.getSurname(), profile.getSex(), profile.getAge()));
        patients.forEach((patient) -> DBinput.Patientinput(patient.getStatus(), patient.getDiagnosis(), patient.getTreatments()));
        //hospitals.forEach((hospital) -> DBinput.Hospitalinput(hospital.getDescription));
    }

}
