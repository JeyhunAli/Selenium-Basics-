package datadriventestNG;

import utilityExcel.Xls_Reader;

public class AddSheetmethod {

	public static void main(String[] args) {

		
		Xls_Reader reader = new Xls_Reader("C:/Users/Ali-c/eclipse-workspace/SeleniumBasics/excell files/spotify.xlsx");
            
		reader.addSheet("hello testing");
		
	}

}
