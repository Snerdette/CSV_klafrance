package com.catalyst.cycle2015;

import java.util.ArrayList; 
import java.util.Scanner;

import com.catalyst.cycle2015.Employee;
import com.catalyst.cycle2015.fileIO.CSVFileWriter;
import com.catalyst.cycle2015.fileIO.CSVFileReader;

public class EmployeeController {
	
	private static CSVFileWriter fileWriter;
	private static EmployeeService employeeService;
	
	private static ArrayList<Employee> empRecords = null;

	public static void main(String[] args) {
		
		fileWriter = new CSVFileWriter();
		employeeService = new EmployeeService();
		empRecords = new ArrayList<Employee>();
		start(); 
	}

 
	private static void start(){
		 
	 
		Scanner in = new Scanner(System.in);
		do {
			
			displayMenu();
			String userInput = in.nextLine();

			switch (userInput) {
			case "B":
				printDB_Records(empRecords);
				break;

			case "R":
				// reads existing file from console, stores in employee object
				CSVFileReader fileReader = new CSVFileReader();
				empRecords = fileReader.parseCsvFile();
				printDB_Records(empRecords);
				break;

			case "D":
				// Sort Employees by Department 
				employeeService.sortByDept(empRecords);
				printDB_Records(empRecords);
				fileWriter.write(empRecords);
				break;

			case "S":
				// Sort employee's names alphabetically
				employeeService.sortByName(empRecords);
				printDB_Records(empRecords);
				fileWriter.write(empRecords);
				break;

			case "C":
				//Sort by Employement Date
				employeeService.sortByEmploymentDate(empRecords);
				printDB_Records(empRecords);
				fileWriter.write(empRecords);
				break;

			case "E":
				System.out.println("EXIT program");
				in.close();
				return;
				 
			default:
				System.out.println("Invalid Input");
				displayMenu();
				break;

			}

		} while (true); 
		
	}

	public static void displayMenu() {
		
		
		String menu = "Please choose an option. \n "
				+ "B: Display records. \n "
				+ "R: Read records from file. \n "
				+ "D: Sort Employees by Department \n "
				+ "S: Sort Employees by Name (last, first) \n "
				+ "C: Sort Employees by Employee Tenure \n "
				+ "E: Exit program \n ";
		
		System.out.println(menu);

	}

	public static void printDB_Records(ArrayList<Employee> list) {
		for(Employee employeeRoster: list){
			System.out.println(employeeRoster);
		}
		
	}

}
