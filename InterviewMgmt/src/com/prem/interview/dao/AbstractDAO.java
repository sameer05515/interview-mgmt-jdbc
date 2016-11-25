/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prem.interview.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.prem.interview.util.ConnectionManager;

/**
 * 
 * @author PREMENDRA
 */
public abstract class AbstractDAO {
	//Connection con = getConnection();
	 
	 protected Connection getConnection(){
		 Connection con = ConnectionManager.getInstance().getConnection();
		 return con;
	 }
	 
	 protected void closeConnection(Connection con){
		 try {
			con.close();
		} catch (SQLException e) {			
		}
	 }

}
