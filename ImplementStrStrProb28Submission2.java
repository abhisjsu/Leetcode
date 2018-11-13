/*
Beatc %age =
*/

class ImplementStrStrProb28Submission2 {
    public int strStr(String haystack, String needle) {

        if(needle.equals("") || haystack.equals(needle))
            return 0;

        if(haystack.equals(""))
            return -1;

        int hlength = haystack.length();
        int nlength = needle.length();


        int lastIndex = hlength-nlength +1;

        for(int i=0;i<lastIndex;i++)
        {
            String current = haystack.substring(i,i+nlength);
            if(current.equals(needle))
            {
                return i;
            }
        }

        return -1;

    }
}
