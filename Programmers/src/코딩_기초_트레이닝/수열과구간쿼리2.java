package 코딩_기초_트레이닝;

public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int num = -1;
            
            for(int j=s; j<e+1; j++){
                if(arr[j] > k){
                    if(num == -1){
                        num = arr[j];
                        continue;
                    }
                    if(arr[j] < num){
                        num = arr[j];
                    } 
                }
            }
            
            answer[i] = num;
        }
        return answer;
    }
}
