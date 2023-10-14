import static java.lang.Integer.parseInt;

public class MaxAndMin {
    public static String solution(String s) {
        String answer = "";
        String[] str=s.split(" ");
        Integer max=-100;
        Integer min=100;
        for(int i =0;i<str.length;i++)
        {
            if(max<parseInt(str[i])){
                max=parseInt(str[i]);
            }
            if(min>parseInt(str[i])){
                min=parseInt(str[i]);
            }
        }
        answer=Integer.toString(min)+Integer.toString(max);
        return answer;
    }
    public static void main(String[] args) {
        solution("1 2 3 4");
        solution("-1 -2 -3 -4");
    }
}