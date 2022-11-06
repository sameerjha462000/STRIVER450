// problem -- https://bit.ly/3Pu0YBn
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    if(s.size() == 0 || s.size() == 1) return s;
	    int top = s.pop();
	    
	    s = sort(s);
	    
	    // place top at the correct position in the sorted stack
	    place(top, s);
	    
	    return s;
	}
	
	private static void place(int top, Stack<Integer> s){
	    Stack<Integer> supp = new Stack<>();
	    
	    while(!s.isEmpty() && s.peek() > top) {
	        supp.push(s.pop());
	    }
	    
	    s.push(top);
	    
	    while(!supp.isEmpty()){
	        s.push(supp.pop());
	    }
	    
	}
}


// ROUGH WORK






