package com.catalyst.cycle2015.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.catalyst.cycle2015.Employee;

public class CSVFileReader {

	private String inFileName;	 
	private static final int MAXFIELDS = 8;
	private static final String COMMA_DELIMITER = ",";
	
	 
	public CSVFileReader() {
		this.inFileName = "csvFiles/employee.csv";
	} 


	/**
	 * Reads from CSV file (text file values separated by comma or white space)
	 * store each row in an Employee object.
	 * 
	 *   The first row of the CSV is the header information.
	 * 
	 */
	public ArrayList<Employee> parseCsvFile(){
		Scanner  fileInput = null;
		try{
			fileInput = new Scanner(new File(inFileName));
		}
		catch (FileNotFoundException e){
			e.printStackTrace();		
		}
		
		ArrayList<Employee> employeeRoster = new ArrayList<Employee>();
		
		fileInput.nextLine();
		
		while (fileInput.hasNext()){
			String[] employeeList = fileInput.nextLine().split(COMMA_DELIMITER);
			parseRow(employeeList, employeeRoster);
			
		}
		
		return employeeRoster;
		
	}

	/**
	 * Given an array of strings that represents a single row in the CSV file,
	 * add an employee object that contains that information to the recordList. 
	 * 
	 * @param tokens
	 * @param recordList
	 * 
	 */
	public void parseRow(String[] tokens, ArrayList<Employee> recordList) {
		recordList.add(new Employee (Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],tokens[3],tokens[4], tokens[5], tokens[7]));
	}

}
