package am.itu.qa.dcs.data;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	private static FileInputStream fis;
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
    
	public static ArrayList<Object[]> sendDataFromSheet(String sheet_name) throws IOException{
		
		ArrayList<Object[]> login_data = new ArrayList<Object[]>();

		fis = new FileInputStream(new File("src\\test\\resources\\DCSTestCases.xlsx"));  
		wb = new XSSFWorkbook(fis);   
		sheet = wb.getSheet(sheet_name); 
		
		int row = sheet.getLastRowNum();

		for(int i = 1; i <= row; i++){            
				String login = sheet.getRow(i).getCell(0).toString();
				String password = sheet.getRow(i).getCell(1).toString();
				
				Object ob[] = {login, password};
				login_data.add(ob);
		}
		wb.close();
		return login_data;
	}
	
	public static Vector<String> validUser() throws IOException{
		FileInputStream file_IS = new FileInputStream("src\\test\\resources\\DCSTestCases.xlsx");  
		wb = new XSSFWorkbook(file_IS);   
		sheet = wb.getSheet("ValidUser");
		Vector<String> valid_user = new Vector<String>();
		valid_user.add( sheet.getRow(0).getCell(0).toString() ); // email
		valid_user.add( sheet.getRow(0).getCell(1).toString().substring(0, 6)); // password
                                                                                //method getCell(cellNum).toString() 
																				//value                     '123456' 
		                                                                        //from excel returns as     '123456.0'
		wb.close();
		return valid_user;
	}
}
