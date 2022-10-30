class Solution {
    public int repeatedStringMatch(String a, String b) {
        int sizea = a.length();
        int sizeb = b.length();
        
        // claim := when |a| >= |b|, then the answer can be {-1, 1, 2}.
        if(sizea >= sizeb) {

            // Example := "ab" and "a" = 1
            // Example := "abcd" and "cda" = 2 (why?) -- ab(cda)bcd

            // Example := "abcd" and "abcd" = 1
            // Example := "abcd" and "bcda" = 2 (why?) -- a(bcda)bcd
            if(a.indexOf(b) != -1) return 1;
            a = a + a;
            
            if(a.indexOf(b) != -1) return 2;
            return -1;
        }
        
        // claim := When |a| < |b|, then the answer can be {-1, Math.ceil(|b| / |a|), Math.ceil(|b| / |a|) + 1}
        
        // Now here sizea < sizeb
        int fac = (int)Math.ceil((1.0 * sizeb)/sizea);
        
        // Now the answer can be either fac or fac+1
        StringBuilder anew = new StringBuilder();
        
        // repeat a fac times
        for(int i = 1; i <= fac;i++) anew.append(a);
        
        if(anew.toString().indexOf(b) != -1) return fac;
        
        // now try for fac+1 i.e, apppend a once more to the anew
        anew.append(a);

        // if we find b as a subtring of the new string formed by repeating a fac+1 times
        if(anew.toString().indexOf(b) != -1) return fac+1;

        // else return -1
        return -1;
    }
}