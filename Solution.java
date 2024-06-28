import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            //int word = 0;
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String put = "";
                //if(i == 0 )
                //{
                    //word = s1.length()+11;
                //}
                for(int j = 0 ; j < 15-s1.length() ; j++)
                {//(word-s1.length())
                    put = put+" ";
                }
                if(x/10 < 1)
                {
                    System.out.println(s1+put+"00"+x );
                }
                else if (x/10 > 9)
                {
                    System.out.println(s1+put+x );
                }
                else
                {
                    System.out.println(s1+put+"0"+x );
                }
            }
            System.out.println("================================");

    }
}



