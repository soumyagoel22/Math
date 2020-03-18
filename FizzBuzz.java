public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        // int i;
        // String j;
        // ArrayList<String> B=new ArrayList<String>();
        // String a1="FizzBuzz";
        // String a2="Fizz";
        // String a3="Buzz";
        // for(i=1;i<=A;i++)
        // {
        //     // j=Integer.toString(i);
        //     if(i%3==0 && i%5==0)
        //     {
        //         B.add(a1);
        //     }
        //      else if(i%3==0)
        //     {
        //         B.add(a2);
        //     }
        //     else if(i%5==0)
        //     {
        //         B.add(a3);
        //     }
        //      else
        //     {
        //          j=Integer.toString(i);
        //         B.add(j);
        //     }
        // }
        // return B;
        int i;
        ArrayList<String> B = new ArrayList<String>();
        String a = "Fizz";
        String b = "Buzz";
        String c = "FizzBuzz";
        String d;
        for(i=1;i<=A;i++)
        {
            if(i%3==0 && i%5==0)
            B.add(c);
            else if(i%5==0)
            B.add(b);
            else if(i%3==0)
            B.add(a);
            else
            {
                d = i.toString();
                B.add(d);
            }
        }
        return B;
    }
}
