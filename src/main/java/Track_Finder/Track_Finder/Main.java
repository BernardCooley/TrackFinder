package Track_Finder.Track_Finder;

import org.openqa.selenium.WebDriver;

import frameworkUtils.BrowserLauncher;

public class Main {

	public static void main(String[] args) {
		
		
		String browser = "Chrome";
		String url = "http://www.mixesdb.com/w/Main_Page";
		String searchTerm = "Laurent Garnier";
		
		BrowserLauncher bL = new BrowserLauncher();
    	WebDriver driver = bL.lauchBrowser(browser);
		
		ReadMixesDB.readMixesDB(driver, url, searchTerm);
		
	}

}
