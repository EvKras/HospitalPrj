package org.hospital.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hospital.entities.Hospital;
import org.hospital.entities.Patient;
import org.hospital.entities.Profile;
import org.hospital.entities.Therapist;

import java.io.File;
import java.io.IOException;

public class JSONParser {

    public static Hospital parseFileToHospital(File file) throws IOException  {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, Hospital.class);
    }
    public static Therapist parseFileToTherapist(File file) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, Therapist.class);
    }
    public static Profile parseFileToProfile(File file) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, Profile.class);
    }
    public static Patient parseFileToPatient(File file) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, Patient.class);
    }
}
