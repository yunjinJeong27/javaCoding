class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int numTwo = 1;
        
        for(int i=2; i<=n; i++){
            answer = (num +numTwo)%1234567;
            num = numTwo%1234567;
            numTwo = answer;    
        }
        return answer;
    }
}