package org.hospital.utils;

import java.io.File;
import java.io.IOException;

import org.hospital.entities.Hospital;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParser {

    public static Hospital parseFileToHospital(File file) throws StreamReadException, DatabindException, IOException  {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, Hospital.class);
    }
}
