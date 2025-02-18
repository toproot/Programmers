package 코딩_기초_트레이닝;

public class 수열과구간쿼리3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length; i++) {
            int num1 = arr[queries[i][0]];
            int num2 = arr[queries[i][1]];
            
            arr[queries[i][0]] = num2;
            arr[queries[i][1]] = num1;
            
        }
        answer = arr;
        return answer;
    }
}
