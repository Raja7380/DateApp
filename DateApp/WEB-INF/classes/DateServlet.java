// DateServlet.java
package com.nt.servlet;

import jakarta.servlet.*;  // Servlet API
import java.io.*;         // IO streams
import java.util.*;       // Utility API
import java.text.*;       // For date and time formatting

public class DateServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Set response content type to browser
        res.setContentType("text/html");
        
        // Get PrintWriter stream from the response object
        PrintWriter pw = res.getWriter();
        
        // Create a Locale for Hindi (India)
        Locale locale = new Locale("EN", "USA");
        
        // Format the date and time according to the specified Locale
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat tf = DateFormat.getTimeInstance(DateFormat.FULL, locale);
        
        String formattedDate = df.format(d);
        String formattedTime = tf.format(d);
        
        // Write the formatted date and time to the response
        pw.println("<h1 style='color:blue;text-align:center'>" + formattedDate + "</h1>");
        pw.println("<h2 style='text-align:center'>" + formattedTime + "</h2>");
        pw.println("<hr>");
        
        // Close the PrintWriter stream (optional as the container usually handles it)
        pw.close();
    }
}
