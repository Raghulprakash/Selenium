package execution;

import java.io.IOException;

import keywords.Keywords;
import utitlities.Excel;

public class Engine {

	
	public static void main (String [] args) throws IOException 
	{
	
		Excel excelutilities = new Excel();
		excelutilities.readexcelfile("src\\test\\resources\\Data.xlsx");
		
		for(int row=1;row<=5;row++)
		{
		String action = excelutilities.getcellvalue(row, 3);
		
		if(action.equalsIgnoreCase("openbrowser"))
		{
			Keywords.openbrowser();
		}else if(action.equalsIgnoreCase("fetchurl"))
		{
			Keywords.fetchurl();
		}else if(action.equalsIgnoreCase("providingusername"))
		{
			Keywords.providingusername();
		}else if(action.equalsIgnoreCase("providinguserpassword"))
		{
			Keywords.providinguserpassword();
		}else if(action.equalsIgnoreCase("iniciatelogin"))
		{
			Keywords.iniciatelogin();
		}
		
		
		
		
		
		}
	}
	
}
