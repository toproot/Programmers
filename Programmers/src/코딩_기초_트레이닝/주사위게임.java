package 코딩_기초_트레이닝;

public class 주사위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a != b && b != c && a != c){
            answer += (a+b+c);
        }else if (a == b && b == c && a == c) {
            answer += ((a+b+c) * ((a*a)+(b*b)+(c*c)) * ((a*a*a)+(b*b*b)+(c*c*c)));
        }else {
            answer += ((a+b+c) * ((a*a)+(b*b)+(c*c)));
        }
        
        return answer;
    }

}
