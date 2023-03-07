//Find duplicate elements in an array({"abc","def",mno","xyz","pqr","xyz","def"})

package assignment;

public class Assignment5 {

	public static void main(String[] args) {
		String ch[] = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);
				}
			}
		}
	}

}
