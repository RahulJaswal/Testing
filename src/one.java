//to calculate the involvement of each caracter in a string word
public class one{

	public static void main(String[] args) {
		String a[] = new String[15];
		int l = args[0].length();
		int j = l, i, count = 0;

		// to divide that string in fragments in array a[]
		for (i = 0; i < l; i++) {
			a[i] = args[0].substring(j - 1, j);
			j--;
		}

		j = i - 1;
		int k = j, count2;

		// to compare each character with other for character count.
		while (j > -1) {
			i = k;
			count = 0;
			while (i > -1) {
				if (a[i].equals(a[j])) {
					count++;
				}
				i--;

			}

			// to ignore a character if it has repetition in string
			int t = j;
			count2 = 0;
			while (t < l) {
				if (a[j].equals(a[t + 1])) {
					count2 = 1;
				}
				t++;
			}

			// count2(=0) will tell me that this first time appearence of
			// character in string.
			if (count2 == 0) {
				System.out.println(a[j] + "=" + count);
			}

			j--;
		}
	}
}
