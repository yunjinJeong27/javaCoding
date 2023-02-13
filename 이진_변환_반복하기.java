class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[2];
        int cnt = 0;
        
        while(!s.equals("1")){
            cnt+= 1;
            answer[0] = cnt;
            int tempLength = s.length();                     
            s= s.replaceAll("0","");
            int sLength = s.length();
            answer[1] += tempLength - sLength;
            s=  Integer.toBinaryString(sLength);          
          
        }
        return answer;
    }
}

