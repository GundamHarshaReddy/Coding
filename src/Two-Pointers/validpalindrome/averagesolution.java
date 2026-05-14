class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        int slen = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<slen;i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                sb.append(s.charAt(i));
            }
        }
        int n = sb.length();
        int pt1 = 0;
        int pt2 = n-1;
        while(pt1<n && pt2>=0){
            if(sb.charAt(pt1)!=sb.charAt(pt2)){
                return false;
            }
            pt1++;
            pt2--;
        }
        return true;
    }
}

