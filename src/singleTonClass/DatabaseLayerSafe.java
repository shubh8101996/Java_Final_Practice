package singleTonClass;

public class DatabaseLayerSafe {

	private static DatabaseLayerSafe instance = null;

	private DatabaseLayerSafe() {

		if (instance != null) {

			throw new RuntimeException("get your object by getInstance()");
		}

	}

	public static DatabaseLayerSafe getInstance() {

		if (instance == null) {

			synchronized (DatabaseLayerSafe.class) {

				if (instance == null) {
					instance = new DatabaseLayerSafe();
				}

			}
		}
		return instance;

	}

}
