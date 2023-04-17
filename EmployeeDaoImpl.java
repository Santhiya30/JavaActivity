
package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dal.helper.MyDBConnection;
import com.dal.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	
	@Override
	public void insertEmployee(Employee emp) {
	     
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("insert into DB values(?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from DB");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("UPDATE DB SET values(??) WHERE values(??) ");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int rowsUpdated = ps.executeUpdate();
			if(rowsUpdated > 0) {
			System.out.println(rowsUpdated  +"An existing user was updated successfully!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("DELETE FROM DB values WHERE (?,?)");
			ps.setString(2, emp.getEname());			
			int rowsDeleted = ps.executeUpdate();
			if(rowsDeleted>0) {
			System.out.println(rowsDeleted  + "A user was deleted successfully!");
			}
			} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}