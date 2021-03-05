package com.knoldus.Assignment.unit;
import com.knoldus.Assignment2.ReadFileToMapImpl;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Map;
public class ReadFileToMapImplTest {
        @Test
        void hashmapFile() throws IOException {
            ReadFileToMapImpl readFileToMap = new ReadFileToMapImpl();
            Map<String, String> map = readFileToMap.getHashMapFromTextFile();

            assert (!map.isEmpty());
            assert (map.containsKey("Nitin"));
            assert (map.containsValue("2"));

        }
    }