package com.qa.Results;

public class Results {
	

	public static int physicsResult = 46;
	public static int chemistryResult = 80;
	public static int biologyResult = 120;
	public static int total = physicsResult+chemistryResult+biologyResult;
		
	
	public static int Overall () {
		int total = physicsResult+chemistryResult+biologyResult;
		return total;
	}
    public static double percentage() {
    double percentage = ((physicsResult+chemistryResult+biologyResult) *100) /450;
    return percentage;
  
}
}