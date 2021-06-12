package com.sssan.factory;

import com.sssan.enums.DatabaseType;
import com.sssan.exception.CustomException;
import com.sssan.interfaces.IDatabaseConnection;
import com.sssan.utils.PropertiesUtil;
import com.sssan.utils.database.ManageMysql;

public class DatabaseFactoryManager {

	public IDatabaseConnection getDatabaseInstance() throws CustomException {
		DatabaseType databaseType = getDatabaseTypeFromClassName();
		IDatabaseConnection databaseConnection = null;
		switch (databaseType) {
		case MYSQL:
			databaseConnection = new ManageMysql();

			break;
		case SQL:

			break;
		case SNOWFLAKE:

			break;

		default:
			break;
		}
		return databaseConnection;
	}

	public DatabaseType getDatabaseTypeFromClassName() throws CustomException {
		String className = PropertiesUtil.getApplicationProperty("classname");
		if (className.toLowerCase().contains("mysql")) {
			return DatabaseType.MYSQL;
		} else if (className.toLowerCase().contains("oracle")) {
			return DatabaseType.ORACLE;
		} else {
			throw new CustomException("No class has been set for the database requested");
		}

	}

}
