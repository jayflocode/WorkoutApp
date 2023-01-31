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
