package com.interview.leetcode.november;

public class ReverseWordsString151 {

    public String reverseWords(String s) {

        String token[] = s.trim().split(" ");

        StringBuffer stringBuffer = new StringBuffer();

        int len = token.length;

        for(int j=len-1;j>=0;j--)
        {
            stringBuffer.append(token[j]+" ");
        }

        return new String(stringBuffer).trim();
    }

    public String reverseWords2(String s) {

        char input[] = s.trim().toCharArray();

        int last = input.length-1;
        char output[] = new char[last+5];

        int end = last;
        int counter = 0;

        for(int i=last;i>=0;i--)
        {
            if(input[i]==' ' || i == 0)//set the end to i and copy the chars to output
            {
                int j=i+1;
                if(i==0)
                    j--;

                if(input[j]==' ')
                {
                    end =  i-1;
                    continue;
                }

                for(;j<=end;j++)
                {
                        output[counter++] = input[j];
                }
                output[counter++] = ' ';
                end =  i-1;
            }

        }

        return new String(output).trim();
    }

    public String reverseWords3(String s) {

        char input[] = s.trim().toCharArray();

        int start =0;
        int end = input.length-1;

        while(start<end)
        {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            end--;
            start++;
        }

        end = input.length;
        start = 0;

        for(int i=0;i<end;i++)
        {
            if(input[i] ==' ' || i ==end-1)
            {
                for(int j=start;j<i;j++)
                {

                }
            }
        }

        return "";
    }

    public static void main(String argv[])
    {
        ReverseWordsString151 r = new ReverseWordsString151();

        System.out.println(r.reverseWords("the sky is blue"));
        System.out.println(r.reverseWords2("the sky is     blue"));
    }
}
