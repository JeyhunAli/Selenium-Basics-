package utilityExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	  static String projectpath;
	 static  XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelpath, String spotify) {
		try {
		projectpath = System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(spotify);
		}catch(Exception exp) {
			exp.printStackTrace();
				
			}
		
	}
	
	public static void main(String[] args) {
		getrowcount();
		getcelldata(0, 0);
		getcelldataNumber(1, 2);
		


	}
	
	public static void getrowcount() {
		try {
			


		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("row "+ rowcount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void getcelldata(int row, int column) {
		try {
	
		String cellData =  sheet.getRow(row ).getCell(column).getStringCellValue();	
		System.out.println(cellData);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	public static void getcelldataNumber(int row, int column) {
		try {
		
		double celData =  sheet.getRow(row).getCell(column).getNumericCellValue();	
		System.out.println(celData);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
