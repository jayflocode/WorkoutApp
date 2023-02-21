package hibernate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class fitScheduler {
	
	
	

	public static void main(String[] args) {
		
		
		
		int input = 1;
		
		LocalDate date = LocalDate.now(); 
		
		LocalTime time = LocalTime.now();
		
		Schedule getSchedule = new Schedule();
		
		setWork changeWorkout = new setWork();
		
		Scanner getInput = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to FitScheduler workout scheduler!\n");
		
		System.out.println("Your Weekly routine as of " + date + "\n");
		
		getSchedule.getSchedule();
		
		
		while (input != 3) {
			
			System.out.println("\nOption 1: Get Schedule, Option 2: Adjust Schedule, Option 3: Update SQL Database, Option 4: Enter 4 to exit.");
			
			
			input = getInput.nextInt();
			
			
			if (input == 1) {
				
				getSchedule.getSchedule();
				
				
			}
			
			
            if (input == 2) {
				
				
				setWork.schedule();
				
			}

			if (input == 3) {

            setDb database = new setDb();

			System.out.println("\nDo you want to delete contents of database before updating? Press 1 to delete");

			input = getInput.nextInt();

			if (input == 1) {



				SqlConnect.purgeTable();

				System.out.println("Contents deleted!");

			}

			database.dbUpdate();




			}
            
            
            if (input == 4) {
				
				input = 3;
				
				
				System.out.println("System is Exciting. Enjoy your workouts3!");
				
				
			}
			

			
		}
		

	}

}
