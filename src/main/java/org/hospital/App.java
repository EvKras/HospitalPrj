package org.hospital;

import java.io.File;
import java.io.IOException;

import org.hospital.entities.Hospital;
import org.hospital.utils.JSONParser;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class App {
    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

        File file = new File("3.hospital.json");
        Hospital hospital = JSONParser.parseFileToHospital(file);

        System.out.println(hospital.toString());
    }

}
