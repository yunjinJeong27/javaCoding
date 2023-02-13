class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int s=1; s<n; s++){
            int sum = s;
            for(int t=s+1; t<n; t++){
                sum = sum+t;                    
                if(sum==n){
                    answer+=1; 
                    break;
                }else if(sum>n){
                    break;
                }
            }   
        }
        return answer;
    }
}