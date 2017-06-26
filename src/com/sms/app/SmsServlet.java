package com.sms.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SmsServlet")
public class SmsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mobile = request.getParameter("number");
		
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);
		String message = "Hi.YourOTPis:"+n;
		
		String url_store = "https://www.smsgatewayhub.com/api/mt/SendSMS?APIKey=XY2BchRKZ0mvHY6UF2Yi3w&senderid="
				+ "TESTIN&channel=2&DCS=0&flashsms=0&number="+mobile+"&text="+message+"&route=1";
		try {
			URL url = new URL(url_store);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json");

			 
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionProvider conn = new ConnectionProvider();
			conn.getCon();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("VerifyOTP.jsp");
		request.setAttribute("otp", n);
		requestDispatcher.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
