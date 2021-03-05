package com.knoldus.Assignment2;

import java.io.IOException;
import java.util.Map;

public class DriverMain {
    public static void main(String[] args) throws IOException {
        Map<String, String> mapFromFile = new ReadFileToMapImpl().getHashMapFromTextFile();
        mapFromFile.forEach((key,value)->{
            System.out.println("Employee Name: "+key+ "" +
                    " => Occurrence: " +value);
        });
    }
}
