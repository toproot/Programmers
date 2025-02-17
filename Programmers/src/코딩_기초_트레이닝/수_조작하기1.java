package 코딩_기초_트레이닝;

public class 수_조작하기1 {
    public int solution(int n, String control) {
        int answer = n;
        char[] chList = control.toCharArray();
        
        for(int i=0; i<chList.length; i++) {
            if(chList[i] == 'w') answer += 1;
            else if(chList[i] == 's') answer -= 1;
            else if(chList[i] == 'd') answer += 10;
            else if(chList[i] == 'a') answer -= 10;
        }
        return answer;
    }
}
