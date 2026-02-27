public class Arrayex {

    public void vowelCheck(String s)
    {
        int len = s.length();
        System.out.println("The given String" + s);
        for (int i=0; i<len ;i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println("the vowels in the word " + ch);
            }

        }
    }

    public void charChange(String s)
    {
        
         char a[] = s.toCharArray();
        for (char c : a)
        {
           if (c == 'a')
           {
            
           }
           System.out.println(c);
        }
        
    } 

}



class MainCl{
    
    public static void main(String[] args) {
        Arrayex a = new Arrayex();
        //a.vowelCheck("LeEtCOde i love you");
        a.charChange("banana");
    }
}


