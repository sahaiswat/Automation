package com.qa.util;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long Page_Load_Timeout=20;
    public static long Implicit_Wait=10;
    
     
    public void switchtoFrame()
    
    {
       	driver.switchTo().frame(0);
    }


}
