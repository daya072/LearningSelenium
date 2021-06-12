package com.sssan.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;

import com.sssan.exception.CustomException;

public interface IDatabaseConnection {

	void setupDriverManager() throws CustomException;

	void setupConnection() throws CustomException;

	void setupStatement() throws CustomException;

	void setupResultSet(String query) throws CustomException;
	
	void setupConnectionClose() throws CustomException;
	
	Connection getDbConnection();
	
	ResultSet getDbResultSet();
	
}
