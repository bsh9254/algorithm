import static java.lang.Integer.parseInt;

public class JadenCase {
    public static String solution(String s) {
        String answer = "";
        String[] str=s.split(" ");

        for(int i=0;i<str.length;i++){
            String word=str[i].toLowerCase();
            String[] wordSplit=word.split("");
            wordSplit[0]=wordSplit[0].toUpperCase();
            word=String.join("",wordSplit);
            str[i]=word;

        }
        answer+=String.join(" ",str);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }
}