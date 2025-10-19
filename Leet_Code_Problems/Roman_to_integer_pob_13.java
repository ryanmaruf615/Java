class Solution {
    public int check(char ch)
    {
        switch(ch)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0 ; i<n ; i++)
        {
            //store the character in ch1 according to i position
            char ch1 = s.charAt(i);
            //first check is there any next value and  
            //check the 1st character is samller then the next character 
            if((i+1) < n && check(ch1) < check(s.charAt(i+1)))
                //if yes then subtract the value of the from the sum 
                sum= sum - check(ch1);
            else
            //if no then Add the value of the from the sum 
                sum= sum + check(ch1);    
        }
        return sum;
    }
}