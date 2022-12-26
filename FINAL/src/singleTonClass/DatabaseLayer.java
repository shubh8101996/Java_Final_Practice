package singleTonClass;

public class DatabaseLayer {  //but this is not thread-safe 

	private static DatabaseLayer instance = null;  //or here you can create instance using new DatabaseLayer();

	private DatabaseLayer() {

	}

	public static DatabaseLayer getInstance() {
		if (instance == null) {
			instance = new DatabaseLayer();
		}
		return instance;
	}

}
