class Solution {
    private static class Interval implements Comparable<Interval>{
        int sp;
        int ep;
        
        Interval(){}
        Interval(int sp, int ep){
            this.sp = sp;
            this.ep = ep;
        }
        Interval(Interval other){
            this.sp = other.sp;
            this.ep = other.ep;
        }

        // This sorts the intervals on the basis of starting point
        @Override
        public int compareTo(Interval other){
            if(this.sp != other.sp){
                return this.sp - other.sp;
            }else{
                return this.ep - other.ep;
            }
        }
        
        @Override
        public String toString(){
            return "["+ sp + ", " + ep + "]";
        }
    }
    public int[][] merge(int[][] intervals) {
        List<Interval> ans = new ArrayList<>();
        
        // convert the data in the form of intervals
        for(int i = 0; i < intervals.length;i++){
            Interval inter = new Interval(intervals[i][0], intervals[i][1]);
            ans.add(inter);
        }
        
        // sort the arraylist of intervals (But why? -- This is because it makes bifurcation relatively easy)
        Collections.sort(ans);

        // This will store the merged intervals
        List<Interval> temp = new ArrayList<>();
        
        /**
         * There can be three cases for two intervals I1 and I2 := 
         * 1. The intervals may be disjoint i.e, I1.ep < I2.sp
         * 2. The intervals may be overlapping I1.ep >= I2.sp
         *    In this we can further have two cases := 
         *    (a) Intervals may be completely overlapping I1.ep >= I2.ep
         *    (b) Intervals may be partially overlapping I1.ep < I2.ep
         **/
        for(Interval curr : ans){
            if(temp.isEmpty())
                // When there is no interval in the temp, then we simply add the interval
                temp.add(curr);
            else{
                Interval prev = temp.get(temp.size()-1);
                
                if(curr.sp <= prev.ep){
                    // overlapping interval
                    prev.ep = Math.max(prev.ep, curr.ep);
                }else{
                    // disjoint interval prev.ep < curr.sp
                    temp.add(curr);
                }
            }
        }
        
        ans = temp;
        
        // simple pantar baazi
        int[][] finalAns = new int[ans.size()][2];
        
        int pointer = 0;
        for(int i = 0; i < finalAns.length;i++, pointer++){
            Interval in = ans.get(pointer);
            finalAns[i][0] = in.sp;
            finalAns[i][1] = in.ep;
        }
        
        return finalAns;
    }
}


// ROUGH WORK







