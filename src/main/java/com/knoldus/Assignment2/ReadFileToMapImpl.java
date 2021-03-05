package com.knoldus.Assignment2;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class ReadFileToMapImpl implements ReadFileToMap{
    final static String filePath = "src/main/java/com/knoldus/Database/EmployeeData.csv";
	@Override
	public Map<String, String> getHashMapFromTextFile()
	{
		Map<String, String> map = new HashMap<String, String>();
		BufferedReader br = null;
		try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line = null;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
                for(String word : parts)
                {
                    map.put(word,(map.containsKey(word))?Integer.toString((Integer.parseInt(map.get(word)) + 1)) : "1");
                }
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				try {
					br.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				};
			}
		}
		return map;
	}
}
