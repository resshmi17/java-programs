/*two wheeler and four wheeler
wheels and vehicles are the input 20 wheels nd 7 vehicle 
3*4=12
4*2=8
*/ 
import java.util.*;
    public class Main 
    {
        public static void main(String []args)
        {
            int w = 540, v= 200;
            int ans = ((v*4)-w)/2;
            if((w&1)==0 && w>=2  && ans>0 && (v-ans)>0)
            System.out.print("TW: "+ ans + " FW: "+ (v -ans));
            else
            System.out.print("Invalid Input");
        }
    }