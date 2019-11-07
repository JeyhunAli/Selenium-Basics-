package com.utility2;

import java.util.ArrayList;

import utilityExcel.Xls_reader2;

public class utilityTest2 {



	static Xls_reader2 reader;

	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try { //first we creating constructor of class and giving the excel path 
			reader = new Xls_reader2 ("C:/Users/Ali-c/eclipse-workspace/SeleniumBasics/excell files/porshmark.xlsx");

		}catch(Exception e ) {
			e.printStackTrace();
		}
		//here starting for loop getting all the row information 
		//then one by one storing all the values from excell sheet 
		for (int rowNum=2; rowNum<=reader.getRowCount("poshmark");rowNum++)
		{
			String firstname = reader.getCellData("poshmark", "firstname", rowNum);
			String lastname = reader.getCellData("poshmark", "lastname", rowNum);
			String email = reader.getCellData("poshmark", "email", rowNum);
			String username = reader.getCellData("poshmark", "username", rowNum);
			String password = reader.getCellData("poshmark", "password", rowNum);
			String gender = reader.getCellData("poshmark", "gender", rowNum);
			String country = reader.getCellData("poshmark", "country", rowNum);

			//then all the string values storing in object
			Object ob[] = {firstname, lastname, email, username, password, gender, country};

			myData.add(ob);

		}
		//then we coming here and returing all the our arraylist values 
		return myData;
	}



}


