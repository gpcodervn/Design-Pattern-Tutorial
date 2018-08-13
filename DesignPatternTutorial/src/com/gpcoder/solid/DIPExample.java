package com.gpcoder.solid;

/**
 * DIP – Dependency inversion principle example
 * 
 * @author gpcoder
 */
interface DBConnection {
	void connect();
}

class OracleConnection implements DBConnection {
	@Override
	public void connect() {
		System.out.println("Oracle connected");
	}
}

class MySQLConnection implements DBConnection {
	@Override
	public void connect() {
		System.out.println("MySQL connected");
	}
}

class PostgreSQLConnection implements DBConnection {
	@Override
	public void connect() {
		System.out.println("PostgreSQL connected");
	}
}

class DatabaseConfig {
	private DBConnection dbConnection;

	public DatabaseConfig(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
		this.dbConnection.connect();
	}

	public DBConnection getConnection() {
		return this.dbConnection;
	}
}

public class DIPExample {

	public static void main(String[] args) {
		DBConnection conn = new OracleConnection();
		DatabaseConfig config = new DatabaseConfig(conn);
	}
}
