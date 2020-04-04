package ss_pack;

public class regex {

	public static void main(String[] args) {
		String n="ABC!@#$%12345venkat*()";
	String	a=n.replaceAll("[^0-9 ,A-Z]", "");
		System.out.println(a);

	}

}
