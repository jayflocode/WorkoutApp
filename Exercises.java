package hibernate;

public class Exercises   {
	
	static String[] exercises = {"1. Bench Press", "2. Tricep Pulldown", "3. Dips", "4. Deadlift", "5. Bicep Curls", "6. Shoulder Press"
			,"7. Squat", "8. Leg Press", "9. Leg Curls", "10.Leg Extensions", "11.Running", "12.Cycling","13.Jump Rope","14.Swimming","15.Off"};
	
	
	

	
	
	public static void getList() {
		

		System.out.println("Upper Body\n");
		
		for (int i = 0; i <= 5; i++) {
			
			System.out.println(exercises[i]);
			
			
		}
		
		
        System.out.println("\nLower Body\n");
		
		for (int i = 6; i <= 9; i++) {
			
			System.out.println(exercises[i]);
			
			
		}
		
        System.out.println("\nCardio\n");
		
		for (int i = 10; i <= 13; i++) {
			
			System.out.println(exercises[i]);
			
			
		}
		
		System.out.println("15. Do not assign");
		
		
		
		
	}
	

}
