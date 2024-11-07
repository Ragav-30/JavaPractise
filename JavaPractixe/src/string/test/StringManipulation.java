package string.test;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Ragav";
		String o = "";
		s += " ";
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {

				o += c;
			} else {
				char f = o.charAt(0);
				char l = o.charAt(o.length() - 1);
				f = Character.toLowerCase(f);
				l = Character.toUpperCase(l);
				ns = ns + f + o.substring(1, o.length() - 1) + l + " ";
				o = "";
			}
		}
		System.out.println(ns);
	}

}
