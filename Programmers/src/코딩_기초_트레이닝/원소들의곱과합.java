package 코딩_기초_트레이닝;

public class 원소들의곱과합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(int[] num_list) {
        int answer;
        int multiple = 1;
        int sum=0;
        
        for(int i=0; i<num_list.length; i++) {
            multiple *= num_list[i];
            sum += num_list[i];
        }
        
        if(multiple > (sum*sum)){
            answer = 0;
        }else {
            answer = 1;
        }
        return answer;
    }

}
