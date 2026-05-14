class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        int slen = s.length();
        String clean = "";
        for(int i=0;i<slen;i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                clean+=s.charAt(i);
            }
        }
        int n = clean.length();
        int pt1 = 0;
        int pt2 = n-1;
        while(pt1<n && pt2>=0){
            if(clean.charAt(pt1)!=clean.charAt(pt2)){
                return false;
            }
            pt1++;
            pt2--;
        }
        return true;
    }
}
