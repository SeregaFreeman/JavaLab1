/**
 * Created by Сергей on 14.03.14.
 */
public class Automat {
    public int term(char symb) {
        switch (symb) {
            case '0': ;
            case '1': ;
            case '2': ;
            case '3': ;
            case '4': ;
            case '5': ;
            case '6': ;
            case '7': ;
            case '8': ;
            case '9': return 0;
            case '.': return 1;
            case 'e': ;
            case 'E': return 2;
            case '+': ;
            case '-': return 3;
            default : return 4;
        }
    }
    public int main(String argc[])
    {
        int avt[][] = {
                {1,3,8,2,8}, //0
                {1,3,5,8,8}, //1
                {1,3,8,8,8}, //2
                {4,8,8,8,8}, //3
                {4,8,5,8,8}, //4
                {7,8,8,6,8}, //5
                {7,8,8,8,8}, //6
                {7,8,8,8,8}  //7
        };
        int fv[] = {0,1,0,0,1,0,0,1};
        int top_index = 0;

        String s;
        System.out.println("Give me a float> ");
        s = "458.5";
        for (int i=0; i<s.length(); i++)
        {
            top_index = avt[top_index][term(s.charAt(i))];
            System.out.println(top_index + "->");
            if (top_index==8)
            {
                System.out.println("Oh, no... it's incorrect.");
                return 1;
            }
        }

        if (fv[top_index] == 1)
        {
            System.out.println("Yeah! This float is correct.");
        }
        else
        {
            System.out.println("Oh, no... it's incorrect.");
        }
        return 0;
}

}