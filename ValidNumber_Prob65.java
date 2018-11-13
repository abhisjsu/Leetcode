package com.interview.leetcode.september;

public class ValidNumber_Prob65 {

    public boolean isNumber(String s) {

        char input[] = s.trim().toCharArray();
        int len = input.length;

        boolean numberSeen = false;
        boolean eSeen = false;
        boolean numberSeenAfterE = true;
        boolean pointSeen = false;


        for(int i=0;i<len;i++)
        {
            if (input[i] >='0' && input[i]<='9')
            {
                numberSeen = true;
                if(eSeen)
                    numberSeenAfterE = true;
            }
            else if (input[i] == '.')
            {
                if (pointSeen || eSeen)
                    return false;

                pointSeen = true;
            }
            else if (input[i] == 'e')
            {
                if (eSeen || !numberSeen)
                    return false;

                eSeen = true;
                numberSeenAfterE = false;
            }
            else if (input[i]=='+' || input[i]=='-')
            {
                if (i !=0 && input[i-1]!='e')
                    return false;
            }
            else
            {
                return false;
            }
        }

        return numberSeen && numberSeenAfterE;

    }

    public static void main(String argv[])
    {
        ValidNumber_Prob65 p = new ValidNumber_Prob65();
        System.out.println(p.isNumber("1 "));

    }
}
