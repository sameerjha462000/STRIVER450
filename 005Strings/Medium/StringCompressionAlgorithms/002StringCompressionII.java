// wwwxxxyyabhi -- w3x3y2abhi
// characters which appear once, do not append the frequency
public static String compression2(String str){
		
		StringBuilder sb = new StringBuilder();

		int index = 0;

		while(index < str.length()) {

			sb.append(str.charAt(index));

			int j = index;

			while(j < str.length() && str.charAt(j) == str.charAt(index)) j++;

			if(j - index > 1){
				sb.append(j - index);
			}

			index = j;
		}
		return sb.toString();
}



// ROUGH WORK







