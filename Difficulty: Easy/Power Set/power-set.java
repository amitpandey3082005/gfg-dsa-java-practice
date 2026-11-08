class Solution {
    public static ArrayList<String> subset(String ans,String s,ArrayList<String> res,int idx){
        if(idx==s.length()){
            res.add(ans);
            return res;
        }
        // recursive case 
        char ch = s.charAt(idx);
        subset(ans+ch,s,res,idx+1); // pick the charecter 
        subset(ans,s,res,idx+1); // skip charecter 
        // return arraylist conatnibg all subset 
        return res;
    }
    public ArrayList<String> powerSet(String s) {
        ArrayList<String> res = new ArrayList<>();
        return subset("",s,res,0);
    }
}
