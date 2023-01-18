package singleTonClass;

public class SingletonClass {

	public static void main(String[] args) {

		DatabaseLayer s = DatabaseLayer.getInstance();
		System.out.println(s);

		DatabaseLayer ss = DatabaseLayer.getInstance();
		System.out.println(ss);

		DatabaseLayerSafe dd = DatabaseLayerSafe.getInstance();
		System.out.println(dd);

		DatabaseLayerSafe dw = DatabaseLayerSafe.getInstance();
		System.out.println(dw);

	}

}
