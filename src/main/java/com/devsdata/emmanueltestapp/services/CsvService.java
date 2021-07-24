package com.devsdata.emmanueltestapp.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;

@Service
public class CsvService {
	
	/*
	 * Helps read csv files into an array
	 * @param String path
	 * @return List<List<String>>  
	 */
	public List<List<String>> readCsvFileIntoArray(String path) throws FileNotFoundException, IOException {
		List<List<String>> records = new ArrayList<List<String>>();
		try (CSVReader csvReader = new CSVReader(new FileReader(path));
			) 
		{
		    String[] values = null;
		    while ((values = csvReader.readNext()) != null) {
		        records.add(Arrays.asList(values));
		    }
		}
		return records;
	}
	
}
