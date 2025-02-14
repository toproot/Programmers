package 코딩_기초_트레이닝;

public class 공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int number, int n, int m) {
        int answer = 0;
        
        int num1 = 0;
        int num2 = 0;
        if (n > m) {
            num1 = n;
            num2 = m;
        }else {
            num1 = m;
            num2 = n;
        }
        
        int result = 1;
        int mod = 0;
        int GCD = 0;
        while(result == 1){
            mod = num1%num2;
            if(mod != 0){
                num1 = num2;
                num2 = mod;
            }else if(mod == 0){
                GCD = num2;
                result = 0;
            }
        }
        
        int LCM = (n*m) / GCD;
        answer = number % LCM;
        
        if (answer == 0) {
            answer = 1;
        }else {
            answer = 0;
        }
        
        return answer;
    }
}
