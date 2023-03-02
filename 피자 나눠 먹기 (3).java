class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice;
        
        if ((double)n/slice>answer){
            answer = answer+1;
        }
        
        return answer;
    }
}