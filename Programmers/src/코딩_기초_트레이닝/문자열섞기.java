package 코딩_기초_트레이닝;

public class 문자열섞기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String solution(String str1, String str2) {
        String answer = "";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        
        for(int i=0; i<char1.length; i++) {
            answer += char1[i];
            answer += char2[i];
        }
        
        return answer;
    }

}
