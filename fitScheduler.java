package jfit;
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
			
			System.out.println("\nOption 1: Get Schedule, Option 2: Adjust Schedule, Option 3: Enter 3 to exit.");
			
			
			input = getInput.nextInt();
			
			
			if (input == 1) {
				
				getSchedule.getSchedule();
				
				
			}
			
			
            if (input == 2) {
				
				
				setWork.schedule();
				
			}
            
            
            if (input == 3) {
				
				input = 3;
				
				
				System.out.println("System is Exciting. Enjoy your workouts3!");
				
				
			}
			
			
			
			
			
			
		}
		

	}

}


setWork Class


package jfit;

import java.util.Scanner;

public class setWork extends Schedule {
	
	// method is used to display choices to change schedule, a separate method will be used to adjust days
	
	public static void schedule()  {
		
		
		//scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		// int used to store user input 
		int input = 1;
		
		// while loop engages to gather user input for days, or exit. 
		
		while (input != 8)  {
		
		System.out.println("\nChoose day to Change\n");
		
		
		// this function calls upon the methods that modify the dates of the Schedule using the information from the Exercises class
		
		System.out.println("(1) Monday (2) Tuesday (3) Wednesday (4) Thursday (5) Friday (6) Sunday (7) Sunday (8) Exit ");
		
		input = scan.nextInt();
		
		
        if (input == 1)  {
			
			monday();
			
			
		}
        
        
        
         if (input == 2)  {
			
			tuesday();
			
			
		}
        
         
         if (input == 3)  {
 			
 			wednesday();
 			
 			
 		} 
         
         
         if (input == 4)  {
 			
 			thursday();
 			
 			
 		}  
         if (input == 5)  {
 			
 			friday();
 			
 			
 		}  
         
         if (input == 6)  {
 			
 			saturday();
 			
 			
 		}  
         
         if (input == 7)  {
 			
 			sunday();
 			
 			
 		}  
         
 		
		
		
		if (input == 8)  {
			
			input = 8;
			//forces the loop to end
			
		}
		
		
		
		}
		
		
	}
	
	//methods used to modify days 
	
	public static void monday()  {
		
		

		//scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		Exercises getEx = new Exercises();
		
		// int used to store user input 
		int input = 1;
		
	
		
		System.out.println("Monday Schedule\n");
		
		for (int i = 0; i < Monday.length; i++) {
			
			System.out.println(Monday[i]);
			
			
		}
		
		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
		
		
		while (input != 3) {
			
			input = scan.nextInt();
			
			
			if (input == 1) {
			
			getEx.getList();
			
			
				
				System.out.println("\nPick Exercise 1");
				
				input = scan.nextInt();
				
				input = input - 1;
				
				Monday[0] = getEx.exercises[input].substring(3);
				
				
				System.out.println("\nPick Exercise 2");
				
				input = scan.nextInt();
				
                input = input - 1;
				
				Monday[1] = getEx.exercises[input].substring(3);
				
                
				System.out.println("\nPick Exercise 3");
				
				input = scan.nextInt();
				
                input = input - 1;
				
				Monday[2] = getEx.exercises[input].substring(3);

			
				input = 3;
			}
			
			if (input == 2) {
				
				

				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
				
				input = scan.nextInt();
				
				if (input == 1) {
				
				Monday[0] = "Empty";
				
				System.out.println("Exercise 1 removed!");
				
				}
				
				else { System.out.println("No Changes Made");}
				
				
				
                System.out.println("\nRemove Exercise 2?  Type 1 to remove");
				
				input = scan.nextInt();
				
				if (input == 1) {
				
				Monday[1] = "Empty";
				
				System.out.println("Exercise 2 removed!");
				
				}
				
				else { System.out.println("No Changes Made");}
				
				
				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
					
					input = scan.nextInt();
					
					if (input == 1) {
					
					Monday[2] = "Empty";
					
					System.out.println("Exercise 3 removed!");
					
					}
					
					else { System.out.println("No Changes Made");}
								
					
				}  
			
				input = 3;
				
			}  
		
			if (input == 3) {
				
				input = 3;
						
				}	
		     }
        public static void tuesday()  {
		
		

		//scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		Exercises getEx = new Exercises();
		
		// int used to store user input 
		int input = 1;
		
	
		
		System.out.println("Tuesday Schedule\n");
		
		for (int i = 0; i < Tuesday.length; i++) {
			
			System.out.println(Tuesday[i]);
			
			
		}
		
		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
		
		
		while (input != 3) {
			
			input = scan.nextInt();
			
			
			if (input == 1) {
			
			getEx.getList();
			
			
				
				System.out.println("\nPick Exercise 1");
				
				input = scan.nextInt();
				
				input = input - 1;
				
				Tuesday[0] = getEx.exercises[input].substring(3);
				
				
				System.out.println("\nPick Exercise 2");
				
				input = scan.nextInt();
				
                input = input - 1;
				
				Tuesday[1] = getEx.exercises[input].substring(3);
				
                
				System.out.println("\nPick Exercise 3");
				
				input = scan.nextInt();
				
                input = input - 1;
				
				Tuesday[2] = getEx.exercises[input].substring(3);

			
				input = 3;
			}
			
			if (input == 2) {
				
				

				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
				
				input = scan.nextInt();
				
				if (input == 1) {
				
				Tuesday[0] = "Empty";
				
				System.out.println("Exercise 1 removed!");
				
				}
				
				else { System.out.println("No Changes Made");}
				
				
				
                System.out.println("\nRemove Exercise 2?  Type 1 to remove");
				
				input = scan.nextInt();
				
				if (input == 1) {
				
				Tuesday[1] = "Empty";
				
				System.out.println("Exercise 2 removed!");
				
				}
				
				else { System.out.println("No Changes Made");}
				
				
				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
					
					input = scan.nextInt();
					
					if (input == 1) {
					
					Tuesday[2] = "Empty";
					
					System.out.println("Exercise 3 removed!");
					
					}
					
					else { System.out.println("No Changes Made");}
								
					
				}  
			
				input = 3;
				
			}  
		
			if (input == 3) {
				
				input = 3;
						
				}	
		     }
        public static void wednesday()  {
        	
    		
    		

    		//scanner object for user input
    		Scanner scan = new Scanner(System.in);
    		
    		Exercises getEx = new Exercises();
    		
    		// int used to store user input 
    		int input = 1;
    		
    	
    		
    		System.out.println("Wednesday Schedule\n");
    		
    		for (int i = 0; i < Wednesday.length; i++) {
    			
    			System.out.println(Wednesday[i]);
    			
    			
    		}
    		
    		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
    		
    		
    		while (input != 3) {
    			
    			input = scan.nextInt();
    			
    			
    			if (input == 1) {
    			
    			getEx.getList();
    			
    			
    				
    				System.out.println("\nPick Exercise 1");
    				
    				input = scan.nextInt();
    				
    				input = input - 1;
    				
    				Wednesday[0] = getEx.exercises[input].substring(3);
    				
    				
    				System.out.println("\nPick Exercise 2");
    				
    				input = scan.nextInt();
    				
                    input = input - 1;
    				
                    Wednesday[1] = getEx.exercises[input].substring(3);
    				
                    
    				System.out.println("\nPick Exercise 3");
    				
    				input = scan.nextInt();
    				
                    input = input - 1;
    				
                    Wednesday[2] = getEx.exercises[input].substring(3);

    			
    				input = 3;
    			}
    			
    			if (input == 2) {
    				
    				

    				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
    				
    				input = scan.nextInt();
    				
    				if (input == 1) {
    				
    				Wednesday[0] = "Empty";
    				
    				System.out.println("Exercise 1 removed!");
    				
    				}
    				
    				else { System.out.println("No Changes Made");}
    				
    				
    				
                    System.out.println("\nRemove Exercise 2?  Type 1 to remove");
    				
    				input = scan.nextInt();
    				
    				if (input == 1) {
    				
    				Wednesday[1] = "Empty";
    				
    				System.out.println("Exercise 2 removed!");
    				
    				}
    				
    				else { System.out.println("No Changes Made");}
    				
    				
    				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
    					
    					input = scan.nextInt();
    					
    					if (input == 1) {
    					
    					Wednesday[2] = "Empty";
    					
    					System.out.println("Exercise 3 removed!");
    					
    					}
    					
    					else { System.out.println("No Changes Made");}
    								
    					
    				}  
    			
    				input = 3;
    				
    			}  
    		
    			if (input == 3) {
    				
    				input = 3;
    						
    				}	
    		     }
            
            public static void thursday()  {
        	
    		
    		

    		//scanner object for user input
    		Scanner scan = new Scanner(System.in);
    		
    		Exercises getEx = new Exercises();
    		
    		// int used to store user input 
    		int input = 1;
    		
    	
    		
    		System.out.println("Thursday Schedule\n");
    		
    		for (int i = 0; i < Thursday.length; i++) {
    			
    			System.out.println(Thursday[i]);
    			
    			
    		}
    		
    		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
    		
    		
    		while (input != 3) {
    			
    			input = scan.nextInt();
    			
    			
    			if (input == 1) {
    			
    			getEx.getList();
    			
    			
    				
    				System.out.println("\nPick Exercise 1");
    				
    				input = scan.nextInt();
    				
    				input = input - 1;
    				
    				Thursday[0] = getEx.exercises[input].substring(3);
    				
    				
    				System.out.println("\nPick Exercise 2");
    				
    				input = scan.nextInt();
    				
                    input = input - 1;
    				
    				Thursday[1] = getEx.exercises[input].substring(3);
    				
                    
    				System.out.println("\nPick Exercise 3");
    				
    				input = scan.nextInt();
    				
                    input = input - 1;
    				
    				Thursday[2] = getEx.exercises[input].substring(3);

    			
    				input = 3;
    			}
    			
    			if (input == 2) {
    				
    				

    				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
    				
    				input = scan.nextInt();
    				
    				if (input == 1) {
    				
    				Thursday[0] = "Empty";
    				
    				System.out.println("Exercise 1 removed!");
    				
    				}
    				
    				else { System.out.println("No Changes Made");}
    				
    				
    				
                    System.out.println("\nRemove Exercise 2?  Type 1 to remove");
    				
    				input = scan.nextInt();
    				
    				if (input == 1) {
    				
    				Thursday[1] = "Empty";
    				
    				System.out.println("Exercise 2 removed!");
    				
    				}
    				
    				else { System.out.println("No Changes Made");}
    				
    				
    				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
    					
    					input = scan.nextInt();
    					
    					if (input == 1) {
    					
    					Thursday[2] = "Empty";
    					
    					System.out.println("Exercise 3 removed!");
    					
    					}
    					
    					else { System.out.println("No Changes Made");}
    								
    					
    				}  
    			
    				input = 3;
    				
    			}  
    		
    			if (input == 3) {
    				
    				input = 3;
    						
    				}	
    		     }
            public static void friday()  {
            	
        		
        		

        		//scanner object for user input
        		Scanner scan = new Scanner(System.in);
        		
        		Exercises getEx = new Exercises();
        		
        		// int used to store user input 
        		int input = 1;
        		
        	  
        		
        		System.out.println("Friday Schedule\n");
        		
        		for (int i = 0; i < Friday.length; i++) {
        			
        			System.out.println(Friday[i]);
        			
        			
        		}
        		
        		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
        		
        		
        		while (input != 3) {
        			
        			input = scan.nextInt();
        			
        			
        			if (input == 1) {
        			
        			getEx.getList();
        			
        			
        				
        				System.out.println("\nPick Exercise 1");
        				
        				input = scan.nextInt();
        				
        				input = input - 1;
        				
        				Friday[0] = getEx.exercises[input].substring(3);
        				
        				
        				System.out.println("\nPick Exercise 2");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Friday[1] = getEx.exercises[input].substring(3);
        				
                        
        				System.out.println("\nPick Exercise 3");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Friday[2] = getEx.exercises[input].substring(3);

        			
        				input = 3;
        			}
        			
        			if (input == 2) {
        				
        				

        				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Friday[0] = "Empty";
        				
        				System.out.println("Exercise 1 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				
                        System.out.println("\nRemove Exercise 2?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Friday[1] = "Empty";
        				
        				System.out.println("Exercise 2 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
        					
        					input = scan.nextInt();
        					
        					if (input == 1) {
        					
        					Friday[2] = "Empty";
        					
        					System.out.println("Exercise 3 removed!");
        					
        					}
        					
        					else { System.out.println("No Changes Made");}
        								
        					
        				}  
        			
        				input = 3;
        				
        			}  
        		
        			if (input == 3) {
        				
        				input = 3;
        						
        				}	
        		     }
            
            public static void saturday()  {
            	
        		
        		

        		//scanner object for user input
        		Scanner scan = new Scanner(System.in);
        		
        		Exercises getEx = new Exercises();
        		
        		// int used to store user input 
        		int input = 1;
        		
        	
        		
        		System.out.println("Sunday Schedule\n");
        		
        		for (int i = 0; i < Sunday.length; i++) {
        			
        			System.out.println(Sunday[i]);
        			
        			
        		}
        		
        		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
        		
        		
        		while (input != 3) {
        			
        			input = scan.nextInt();
        			
        			
        			if (input == 1) {
        			
        			getEx.getList();
        			
        			
        				
        				System.out.println("\nPick Exercise 1");
        				
        				input = scan.nextInt();
        				
        				input = input - 1;
        				
        				Sunday[0] = getEx.exercises[input].substring(3);
        				
        				
        				System.out.println("\nPick Exercise 2");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Sunday[1] = getEx.exercises[input].substring(3);
        				
                        
        				System.out.println("\nPick Exercise 3");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Sunday[2] = getEx.exercises[input].substring(3);

        			
        				input = 3;
        			}
        			
        			if (input == 2) {
        				
        				

        				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Sunday[0] = "Empty";
        				
        				System.out.println("Exercise 1 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				
                        System.out.println("\nRemove Exercise 2?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Sunday[1] = "Empty";
        				
        				System.out.println("Exercise 2 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
        					
        					input = scan.nextInt();
        					
        					if (input == 1) {
        					
        					Sunday[2] = "Empty";
        					
        					System.out.println("Exercise 3 removed!");
        					
        					}
        					
        					else { System.out.println("No Changes Made");}
        								
        					
        				}  
        			
        				input = 3;
        				
        			}  
        		
        			if (input == 3) {
        				
        				input = 3;
        						
        				}	
        		     }
            
            
                public static void sunday()  {
            	
        		
        		

        		//scanner object for user input
        		Scanner scan = new Scanner(System.in);
        		
        		Exercises getEx = new Exercises();
        		
        		// int used to store user input 
        		int input = 1;
        		
        	
        		
        		System.out.println("Sunday Schedule\n");
        		
        		for (int i = 0; i < Sunday.length; i++) {
        			
        			System.out.println(Sunday[i]);
        			
        			
        		}
        		
        		System.out.println("\n(1) Add Workout (2) Remove Workout (3) exit\n");
        		
        		
        		while (input != 3) {
        			
        			input = scan.nextInt();
        			
        			
        			if (input == 1) {
        			
        			getEx.getList();
        			
        			
        				
        				System.out.println("\nPick Exercise 1");
        				
        				input = scan.nextInt();
        				
        				input = input - 1;
        				
        				Sunday[0] = getEx.exercises[input].substring(3);
        				
        				
        				System.out.println("\nPick Exercise 2");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Sunday[1] = getEx.exercises[input].substring(3);
        				
                        
        				System.out.println("\nPick Exercise 3");
        				
        				input = scan.nextInt();
        				
                        input = input - 1;
        				
        				Sunday[2] = getEx.exercises[input].substring(3);

        			
        				input = 3;
        			}
        			
        			if (input == 2) {
        				
        				

        				System.out.println("\nRemove Exercise 1?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Sunday[0] = "Empty";
        				
        				System.out.println("Exercise 1 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				
                        System.out.println("\nRemove Exercise 2?  Type 1 to remove");
        				
        				input = scan.nextInt();
        				
        				if (input == 1) {
        				
        				Sunday[1] = "Empty";
        				
        				System.out.println("Exercise 2 removed!");
        				
        				}
        				
        				else { System.out.println("No Changes Made");}
        				
        				
        				 System.out.println("\nRemove Exercise 3?  Type 1 to remove");
        					
        					input = scan.nextInt();
        					
        					if (input == 1) {
        					
        					Sunday[2] = "Empty";

        					
        					System.out.println("Exercise 3 removed!");
        					
        					}
        					
        					else { System.out.println("No Changes Made");}
        								
        					
        				}  
        			
        				input = 3;
        				
        			}  
        		
        			if (input == 3) {
        				
        				input = 3;
        						
        				}	
        		     }
            
            
        
	

}


Exercises Class


package jfit;

public class Exercises   {
	
	// Execises Array that stores a list of exercises. 
	
	static String[] exercises = {"1. Bench Press", "2. Tricep Pulldown", "3. Dips", "4. Deadlift", "5. Bicep Curls", "6. Shoulder Press"
			,"7. Squat", "8. Leg Press", "9. Leg Curls", "10.Seated Leg Extensions", "11. Running", "12. Cycling","13. Jump Rope","14. Swimming","   "};
	
	
	

	// prints list of available exercises
	
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












Schedule Class


package jfit;

public class Schedule {
	
	static String[] Monday = {"Empty", "Empty", "Empty"};
	static String[] Tuesday = {"Empty", "Empty", "Empty"};
	static String[] Wednesday = {"Empty", "Empty", "Empty"};
	static String[] Thursday = {"Empty", "Empty", "Empty"};
	static String[] Friday = {"Empty", "Empty", "Empty"};
	static String[] Saturday = {"Empty", "Empty", "Empty"};
	static String[] Sunday = {"Off", "", ""};
	
	
	
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




