# WorkoutApp

This app is created using IntelliJ with hibernate components, and Servlet functionality. Servlet is a java programming class that extends the capacities of servers, in this case, Tomcat Apache. The app is command line based for the purposes of storing information in java, moving stored information into SQL, and then launching an Apache server that is able to read information from a SQL database. 

The java classes fitScheduler(main), schedule, setWork, Exercises are used together to gather data from an String Array (located in Exercises.java), set the information from Exercises.java and assign the information in the String Arrays into Schedule.java (workout schedule located here). 

After the information is stored, the end user gets the option to upload the information into a SQL database. The video below shows visual feedback. 

https://youtu.be/CpqQZZkvr6g

Now that the information has been pushed to the database using the (setDB method) which users hibernate, a java tool to connect to sql databases, we launch the tomcat server project that stores similar classes, and access the website stored in the server's iDE. The Website is included in the webapp folder. This website includes html, .css, and javascript code. 

Once the website is launched, clicking on the workout hyberlink in the bottom loads the Servlet. The Servlet classes pushes html code once the link is clicked, and the html code is basically a formatted webpage that loads the SQL database information we uploaded using the client fit scheduler app. 

https://www.youtube.com/watch?v=bpffjIJ39W8


