package FactoryDesignPattern;

public class DatabaseFactory {

	public DatabaseFactory() throws IllegalAccessException {

		throw new IllegalAccessException("Object Can't be Created: ");
	}

	public static Database createDatabaseObject(DatabaseType type) {

		switch (type) {
		case MYSQL:
			return new Mysql();
		case ORACLE:
			return new Oracle();
		default:
			return null;
		}

	}

}
