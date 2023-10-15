public class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int capetSize= brown+yellow;

        for(int i=1;i<=capetSize;i++)
        {
            int row=i;
            int col=capetSize/row;

            if(row>col)
            {
                continue;
            }
            if((row-2)*(col-2)==yellow){
                answer[0]=col;
                answer[1]=row;
                return answer;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10,3));
        System.out.println(solution(24,24));
    }
}
