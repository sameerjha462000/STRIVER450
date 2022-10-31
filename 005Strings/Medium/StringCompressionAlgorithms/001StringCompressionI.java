// wwwwwxxxxxxyyyyyyyzzzzabhi -- wxyzabhi
public static String compression1(String str) {
		StringBuilder sb = new StringBuilder();

		int index = 0;

		while(index < str.length()) {
			sb.append(str.charAt(index));

			int j = index;

			while(j < str.length() && str.charAt(j) == str.charAt(index)) j++;

			index = j;
		}

		return sb.toString();
}


// ROUGH WORK







