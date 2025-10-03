import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class student{
    
    int age;
    String name;

    public student(int age, String name)
    {
        
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Student name: "+name+" , age: "+age;
    }

}



public class mapex {
    public static void main(String[] args)
    {
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i , Integer J)
        //     {
        //         if(i%10 > J%10) 
        //             return 1;
        //         else 
        //             return -1; 
        //     }
        // };

        // with lambda function
        // Comparator<Integer> com = (Integer i , Integer j) -> i%10 > j%10 ? 1 : -1 ;
            

        // Comparator<student> com = (student s1 , student s2) ->
        //     {
        //         // if(s1.age > s2.age)
        //         //     return 1;
        //         // else
        //         //     return -1;    
        //         return s1.age > s2.age ? 1 : -1 ;
        //     };

        // with lambda function
        Comparator<student> com = ( s1 ,s2) ->  s1.age > s2.age ? 1 : -1 ;

        List<student> studs = new ArrayList<>();
        studs.add(new student(28,"maruf"));
        studs.add(new student(26,"mou"));
        studs.add(new student(35,"jamal"));
        studs.add(new student(30,"tonny"));

        /* 
        List<Integer> nums = new ArrayList<>();
        nums.add(72);
        nums.add(21);    
        nums.add(84);
        nums.add(45);    
        nums.add(17);
        */

        Collections.sort(studs,com);
        

    for(student s : studs)
        System.out.println(s);
    }
}

