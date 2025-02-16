package 코딩_기초_트레이닝;

public class 등차수열의_특정한_항만_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i < included.length; i++) {
            int num = 0;
            num += (a + (d*i));
            if (included[i]) answer += num;
        }
        return answer;
    }

}
