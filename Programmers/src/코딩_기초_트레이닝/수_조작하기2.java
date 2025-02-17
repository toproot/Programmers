package 코딩_기초_트레이닝;

public class 수_조작하기2 {
    public String solution(int[] numLog) {
        String answer = "";
        int flagNum = numLog[0];
        for(int i=1; i<numLog.length; i++) {
            int num = numLog[i] - numLog[i-1];
            if (num == 1) answer += "w";
            if (num == -1) answer += "s";
            if (num == 10) answer += "d";
            if (num == -10) answer += "a";
        }
        
        return answer;
    }
}
