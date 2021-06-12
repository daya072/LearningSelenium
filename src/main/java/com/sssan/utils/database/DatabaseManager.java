package com.sssan.utils.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.sssan.exception.CustomException;
import com.sssan.factory.DatabaseFactoryManager;
import com.sssan.interfaces.IDatabaseConnection;
import com.sssan.utils.PropertiesUtil;

public class DatabaseManager {

	private IDatabaseConnection connectionInstance;

	private void getDatabaseConnectionInstance() throws CustomException {
		DatabaseFactoryManager datbaseFactoryManager = new DatabaseFactoryManager();
		connectionInstance = datbaseFactoryManager.getDatabaseInstance();
	}

	public ResultSet getResultset(String query) throws CustomException {
		getDatabaseConnectionInstance();
		System.out.println(connectionInstance);
		connectionInstance.setupDriverManager();
		try {
			connectionInstance.setupConnection();
			connectionInstance.setupStatement();
			connectionInstance.setupResultSet(query);
			return connectionInstance.getDbResultSet();
		} catch (CustomException e) {
			throw new CustomException("Database connection not successful", e);
		}

	}

	@Test
	public void test() throws CustomException, SQLException {
		PropertiesUtil.loadProperties();
		ResultSet result = getResultset("select * from storagedemo");
		while (result.next()) {
			System.out.println(result.getString(1));
		}
		connectionInstance.setupConnectionClose();
	}

}
