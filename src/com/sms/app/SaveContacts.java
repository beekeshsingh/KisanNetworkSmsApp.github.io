package com.sms.app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaveContacts {
	public static int register(ContactsBean u){  
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into Contacts(Contact,FirstName,LastName) values(?,?,?)");  
		ps.setString(1,u.getContact());  
		ps.setString(2,u.getFirstName());  
		ps.setString(3,u.getLastName());  
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}  
}
