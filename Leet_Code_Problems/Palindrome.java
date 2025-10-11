package Leet_Code_Problems;

class solution {
    
    public boolean isPalindrome(int x) {
        int[] digit= String.valueOf(x) //Step 1: Convert to String
                           .chars() //Step 2: Convert to IntStream or it converts inti Unicode (ASCII)
                           .map(c->c - '0') //Step 3: Convert char to int (ASCII to int where 0=48 , 49 - 48 = 1 ,50 - 48 = 2 , 49 - 48 = 1)
                           .toArray(); //Step 4: Convert to int array
        int n = digit.length;

        for(int i=0;i<n/2;i++)
        {
            System.out.println(digit[i]);
            if(digit[i] != digit[n-i-1])
            {
                System.out.println("Not a palindrome " + digit[i] + " " + digit[n-i-1]);
                return false;
                
            }
            
        }
            System.out.println("Is a palindrome");
        return true;
    }
}
class Palindrome{
    public static void main(String[] args)
    {
        solution s = new solution();
        s.isPalindrome(11611);
    }
}
    

