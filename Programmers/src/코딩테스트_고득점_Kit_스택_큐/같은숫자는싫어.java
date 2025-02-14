package 코딩테스트_고득점_Kit_스택_큐;
import java.util.ArrayList;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] input = {1,1,3,3,0,1,1};
		
		
		for (int i : solution(input)){
			System.out.println(i);
		}
	}
	
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int[] input = arr;
        int cnt = 0;
        for(int i=1; i < input.length; i++) {
            if(input[i] == input[i-1]){
                input[i] = -1;
                cnt+=1;
            }else {
                continue;
            }
        }
        
        answer = new int[input.length - cnt];
        int index = 0;
        for(int i=0; i < input.length; i++) {
            if(input[i] != -1) {
                answer[index] = input[i];
                index++;
            }else {
                continue;
            }
        } 
            
        return answer;
    }
}
