package hibernate;

public class Schedule {
	
	static String[] Monday = {"Empty", "Empty", "Empty"};
	static String[] Tuesday = {"Empty", "Empty", "Empty"};
	static String[] Wednesday = {"Empty", "Empty", "Empty"};
	static String[] Thursday = {"Empty", "Empty", "Empty"};
	static String[] Friday = {"Empty", "Empty", "Empty"};
	static String[] Saturday = {"Empty", "Empty", "Empty"};
	static String[] Sunday = {"Off", "Off", "Off"};
	
	
	
	public void getSchedule() {
		
		
		System.out.println("Monday\n");
		
		for (int i = 0; i < Monday.length; i++) {
			
			System.out.println(Monday[i]);
			
			
		}
		
		System.out.println("\nTuesday\n");
		
		
        for (int i = 0; i < Tuesday.length; i++) {
			
			System.out.println(Tuesday[i]);
			
			
		}
        
        System.out.println("\nWednesday\n");
        
        
        for (int i = 0; i < Wednesday.length; i++) {
			
			System.out.println(Wednesday[i]);
			
			
		}
        
        System.out.println("\nThursday\n");
        
        for (int i = 0; i < Thursday.length; i++) {
			
			System.out.println(Thursday[i]);
			
			
		}
        
        System.out.println("\nFriday\n");
        
        
        for (int i = 0; i < Friday.length; i++) {
			
			System.out.println(Friday[i]);
			
			
		}
        
        System.out.println("\nSaturday\n");
        
        for (int i = 0; i < Saturday.length; i++) {
			
			System.out.println(Saturday[i]);
			
			
		}
        
        System.out.println("\nSunday\n");
        
        for (int i = 0; i < Saturday.length; i++) {
			
			System.out.println(Sunday[i]);
			
			
		}
 		
		
		
		
	}
	

}
