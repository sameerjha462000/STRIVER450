// problem -- https://www.codingninjas.com/codestudio/problems/binary-strings-with-no-consecutive-1s_893001?leftPanelTab=0
// https://bit.ly/3QJ0vwc
public class Solution {
	public static ArrayList<String> generateString(int k) {
        if(k == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        
        ArrayList<String> rres = generateString(k-1);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String st : rres){
            char last = st.charAt(st.length()-1);
            if(last == '0'){
                ans.add(st + "0");
                ans.add(st + "1");
            }else{
                ans.add(st + "0");
            }
        }
        
        return ans;
	}
}



// ROUGH WORK









