package ch048.generic_class;

public class Demo {

	public static void main(String[] args) {
		MyGenericClass<String> gClass = new MyGenericClass<String>("Hello");
		System.out.println("T: " + gClass.getKey());
	}

}
