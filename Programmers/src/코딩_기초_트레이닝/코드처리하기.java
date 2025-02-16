package 코딩_기초_트레이닝;

public class 코드처리하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] cList = code.toCharArray();
        
        for(int i=0; i<cList.length; i++){
            if (mode == 0){
                if (cList[i] != '1' && ((i%2) == 0)){
                    answer += cList[i];
                }else if (cList[i] == '1'){
                    mode = 1;
                }
            }else if (mode == 1){
                if (cList[i] != '1' && ((i%2) == 1)){
                    answer += cList[i];
                }else if (cList[i] == '1') {
                    mode = 0;
                }
            } 
        }
        
        if (answer.equals("")) answer += "EMPTY";
        
        return answer;
    }

}
