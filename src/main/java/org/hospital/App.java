package org.hospital;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import org.hospital.dbconnection.Connector;
import org.hospital.entities.Hospital;
import org.hospital.utils.JSONParser;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        File file = new File("3.hospital.json");
        Hospital hospital = JSONParser.parseFileToHospital(file);

        System.out.println(hospital.toString());

        Connector connector = Connector.Cnt();
    }

}
