package com.example.mod7a;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Servlet extends HttpServlet {

    public static ArrayList<String> arrayMaster;     //array list used store results of query
    public static String query = "SELECT * FROM Days";  //static query for printing


    /* the method below is used to only print the rows without any added string builder methods
    the main reason for this is because it is better to use independent values for html manipulation through
    servlet print writing
     */
    public static void printS() throws Exception {

        //clears array so it doesn't stack queries with the same information


        ArrayList<String> dbarray = new ArrayList<String>();



        Connection con = sql();
        System.out.println("Select Query established");
        System.out.println();

        Statement statement = con.createStatement();

        //query orders varchar information by numbers





        try {
            ResultSet resultSet = statement.executeQuery(query);


            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();



            StringBuilder info = new StringBuilder();
            String in = "";

            while (resultSet.next()) {

                StringBuilder builder = new StringBuilder();

                String string = "";


                String[] row = new String[columnCount];


                for (int i = 0; i < columnCount; i++) {

                    row[i] = resultSet.getString(i + 1);

                    System.out.println((row[i]));

                    dbarray.add(row[i]);


                }


            }

            arrayMaster = dbarray;



        } catch (SQLException e) {
            // TODO Auto-generated catch block

            System.out.println("There is an issue with the formatting of your query, try again");
            System.out.println(e);


        }

    }

     //method below provides a sql connection through jdbc to establish driver

    public static  Connection sql() throws Exception {


        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/fit";
            String username = "root";
            String password = "Jayroot84";

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to database");

            return conn;

        } catch (Exception e)
        {
            System.out.println("Error in connection try again");
        }


        return null;


}
    //the method below is used to allow proper printing of columns and cells
    private static String pad(String s) {

        int COLUMN_WIDTH = 25;

        int padCount = COLUMN_WIDTH - s.length();

        StringBuilder sb = new StringBuilder(25);

        sb.append(s);

        for (int i = 0; i < padCount; i++) {
            sb.append(" "); }



        return sb.toString();
    }


    // this is the original print method which just prints characters, html shortened version is on the top
    public static void print() throws Exception {

        //clears array so it doesn't stack queries with the same information


        ArrayList<String> dbarray = new ArrayList<String>();



        Connection con = sql();
        System.out.println("Select Query established");
        System.out.println();

        Statement statement = con.createStatement();

        //query orders varchar information by numbers





        try {
            ResultSet resultSet = statement.executeQuery(query);


            StringBuilder sb = new StringBuilder();

            String st = "";

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount(); for (int i = 0; i < columnCount; i++) {

                System.out.print(pad(metaData.getColumnName(i + 1)));

                //adds column to array as first element


                st = pad(metaData.getColumnName(i + 1));


                st = sb.append(st).toString();


            }

            dbarray.add(st);


            System.out.println();
            System.out.println();

            //adds multiple lines to array

            dbarray.add("");

            StringBuilder info = new StringBuilder();
            String in = "";

            while (resultSet.next()) {

                StringBuilder builder = new StringBuilder();

                String string = "";


                String[] row = new String[columnCount];


                for (int i = 0; i < columnCount; i++) {

                    row[i] = resultSet.getString(i + 1);

                    // adds row to array

                    System.out.print(pad(row[i]));


                    in = pad(row[i]);
                    in = builder.append(in).toString();

                }

                dbarray.add(in);

                System.out.println();

            }

            System.out.println();


            arrayMaster = dbarray;

            for (int i = 0; i < arrayMaster.size(); i++) {

                System.out.println(arrayMaster.get(i));


            }

            System.out.println("Size of array is " + arrayMaster.size());
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            System.out.println("There is an issue with the formatting of your query, try again");
            System.out.println(e);


        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Get request has been made");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("Connected to SQL database Via Serv Method");

        try {
            printS();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        response.setContentType("text/html");  //establishes servlet response type to be html, will be passing html code


          //sends html code for just the columns only

        response.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Schedule</title>\n" +
                "    <!-- links to main.css for attribute changes -->\n" +
                "    <link rel=\"stylesheet\" href=\"main.css\">\n" +
                "    \n" +
                "   \n" +
                "  </head>\n" +
                "\n" +
                "  <body>\n" +
                "\n" +
                "    <!-- Start of Header -->\n" +
                "    <header class=\"container\" class=\"container group\"> \n" +
                "    \n" +
                "\n" +
                "\n" +
                "    <h3 class=\"title\">Java Fitness App Schedule</h3>\n" +
                "\n" +
                "    \n" +
                "     <!-- JavaScript button for website -->\n" +
                "    \n" +
                "    <img id=\"myImage\" src=\"fits.gif\" style=\"width:200px\"> <br>\n" +
                "\n" +
                "    <button onclick=\"document.getElementById('myImage').src='fit2.gif'\">Beast mode on!</button>\n" +
                "\n" +
                "    <button onclick=\"document.getElementById('myImage').src='fits.gif'\">Beast mode off!</button>\n" +
                "\n" +
                "        <br>");

            response.getWriter().println("<link rel=\"stylesheet\" href=\"main.css\"> <section class=\"pad\">\n" +
                    "\n" +
                    "    <table style=\"width:100%\">\n" +
                    "        <tr class=\"heading\">\n" +
                    "            <th>Monday</th> \n" +
                    "            <th>Tuesday</th>\n" +
                    "            <th>Wednesday</th>\n" +
                    "            <th>Thursday</th>\n" +
                    "            <th>Friday</th>\n" +
                    "            <th>Saturday</th>\n" +
                    "            <th>Sunday</th>\n" +
                    "\n" +
                    "        </tr> ");
             // html code ends for the first column

            // loop to iterate array

                for (int i = 0; i < arrayMaster.size(); i++) {

                    //using if statements to make sure the html code is written per start and end of rows
                    if (i == 0)  {

                        response.getWriter().println("<tr class=\"cells\">");

                    }

                    if (i == 7)  {

                        response.getWriter().println("<tr class=\"cells\">");

                    }

                    if (i == 14)  {

                        response.getWriter().println("<tr class=\"cells\">");

                    }

                    response.getWriter().println("<td>");
                    response.getWriter().println(arrayMaster.get(i));
                    response.getWriter().println("</td>");

                    //using if statements to make sure the html code is written per start and end of rows

                    if (i == 6)  {

                        response.getWriter().println("</tr>");

                    }

                    if (i == 13)  {

                        response.getWriter().println("</tr>");

                    }

                    if (i == 20)  {

                        response.getWriter().println("</tr>");

                    }


                }

             //  last statement closing with the close of the table and section
               response.getWriter().println("</table></section>");

        response.getWriter().println("</header>\n" +
                "\n" +
                "     <!-- end of header -->\n" +
                "\n" +
                "      <!-- details section -->\n" +
                "    \n" +
                "    <section class=\"hero container\">\n" +
                "     <section>\n" +
                "        <h5>Developer: Jayson Flores</h5>\n" +
                "        <h3>Market: Fitness</h3>\n" +
                "        <p>Release Date: 2023</p>\n" +
                "     </section>\n" +
                "    </section>\n" +
                "\n" +
                "    <nav  class=\"links\">\n" +
                "        <a href=\"index.jsp\">Home</a>\n" +
                "        <a href=\"schedule.jsp\">Access Fit Schedule</a>\n" +
                "        <a href=\"contact.html\">Contact Us</a>\n" +
                "      </nav>\n" +
                "\n" +
                "       <!-- start of footer -->\n" +
                "\n" +
                "    <footer class=\"footer\" >\n" +
                "        <small>&copy; JavaInk</small>\n" +
                "      </footer>\n" +
                "\n" +
                "     <!-- end of footer -->\n" +
                "      \n" +
                "\n" +
                "  </body>\n" +
                "\n" +
                "\n" +
                "</html>");



    }
}
