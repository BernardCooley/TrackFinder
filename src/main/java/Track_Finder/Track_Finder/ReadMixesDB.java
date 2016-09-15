package Track_Finder.Track_Finder;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import frameworkUtils.CommonFunctions;

public class ReadMixesDB {

	public static void readMixesDB(WebDriver driver, String url, String searchTerm) {
		ArrayList<String> setTitles = new ArrayList<String>(); 
		
		driver.get(url);
		
		CommonFunctions.enterString(driver, ui_Maps.MixesDB.searchBox, searchTerm);
		CommonFunctions.clickElement(driver, ui_Maps.MixesDB.searchGoBtn);
		
		
		
		
	}
	
	
}
