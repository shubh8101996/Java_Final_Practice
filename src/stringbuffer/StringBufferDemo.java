package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("shubham"); // def capacity 16
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println(sb.capacity());

		System.out.println(sb.append("shedge"));
		System.out.println(sb.capacity());

		System.out.println(sb.append("java"));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.charAt(4));
//		System.out.println(sb.delete(3, 10));
		System.out.println(sb.equals(sb1));
		System.out.println(sb.insert(3, "zzs"));
		System.out.println(sb.replace(3, 10, "java"));
		System.out.println(sb.reverse());
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(3, 7));
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());

	}

}
