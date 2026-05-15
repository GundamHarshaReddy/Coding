class Solution {
    public String mergeAlternately(String s1, String s2) {
        int p1=0;
        int p2=0;
        int n1 = s1.length();
        int n2 = s2.length();

        StringBuilder sb = new StringBuilder();

        while(p1<n1 && p2<n2){
            sb.append(s1.charAt(p1));
            sb.append(s2.charAt(p2));
            p1++;
            p2++;
        }
        while(p1<n1){
            sb.append(s1.charAt(p1));
            p1++;
        }
        while(p2<n2){
            sb.append(s2.charAt(p2));
            p2++;
        }
        String result = sb.toString();
        return result;
    }
}