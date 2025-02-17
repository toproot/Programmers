package 코딩_기초_트레이닝;

public class 마지막_두_원소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int lastNum = num_list[num_list.length-1];
        int preLastNum = num_list[num_list.length-2];
        int resultNum = 0;
        
        if (lastNum > preLastNum) {
            resultNum = lastNum - preLastNum;
        }else {
            resultNum = (lastNum * 2);
        }
        
        answer = new int[num_list.length +1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        answer[answer.length-1] = resultNum;
        return answer;
    }

}
