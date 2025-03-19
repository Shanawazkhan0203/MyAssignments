package week1.day3;

import java.util.Arrays;

public class Browser {
	
private static int lengthofArray;


public void launchBrowser() {
	System.out.println("the browser is ready to launch");
}

public void loadUrl() {
	System.out.println("the url is loading");
}


public static void main(String args[]) {
	Browser open = new Browser();
	
	open.launchBrowser();
	open.loadUrl();

}
}
