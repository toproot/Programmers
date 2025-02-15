package 코딩_기초_트레이닝;

public class 이어붙인수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i=0; i<num_list.length; i++) {
            if((num_list[i]%2) == 1){
                odd += Integer.toString(num_list[i]);
            }else {
                even += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}
