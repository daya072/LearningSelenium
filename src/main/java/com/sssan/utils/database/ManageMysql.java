package com.sssan.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sssan.exception.CustomException;
import com.sssan.interfaces.IDatabaseConnection;
import com.sssan.utils.PropertiesUtil;

public class ManageMysql implements IDatabaseConnection {

	private Connection connection;
	private Statement statement;
	private ResultSet resultset;

	@Override
	public void setupDriverManager() throws CustomException {
		try {
			Class.forName(PropertiesUtil.getApplicationProperty("classname"));
		} catch (CustomException e) {
			throw new CustomException("");
		} catch (ClassNotFoundException e) {
			throw new CustomException("");
		}

	}

	@Override
	public void setupConnection() throws CustomException {
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getApplicationProperty("url"), PropertiesUtil.getApplicationProperty("username"), PropertiesUtil.getApplicationProperty("password"));
		} catch (SQLException e) {
			throw new CustomException("");
		}

	}

	@Override
	public void setupStatement() throws CustomException {
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			throw new CustomException("");
		}

	}

	@Override
	public void setupResultSet(String query) throws CustomException {
		try {
			resultset = statement.executeQuery(query);
		} catch (SQLException e) {
			throw new CustomException("");
		}

	}

	@Override
	public void setupConnectionClose() throws CustomException {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new CustomException("");
		}

	}

	@Override
	public Connection getDbConnection() {
		return connection;
	}

	@Override
	public ResultSet getDbResultSet() {
		return resultset;
	}

}
