import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mapex {
    public static void main(String[] args)
    {
        Comparator com = new Comparator<Integer>() {
            public int compare(Integer i , Integer J)
            {
                if(i%10 > J%10) 
                    return 1;
                else 
                    return -1; 
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(72);
        nums.add(21);    
        nums.add(84);
        nums.add(45);    
        nums.add(17);

        Collections.sort(nums,com);

        System.out.println(nums);


    }
}
