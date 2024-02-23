class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        String p;
        for(int i=0;i<words.size();i++){
           p=words.get(i);
            res+=p.charAt(0);
        }
        if(s.equalsIgnoreCase(res)){
            return true;
        }
       return false;
    }
}