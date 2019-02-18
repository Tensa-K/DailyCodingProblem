import java.util.stream.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Integer[] test1 = {1,3,-2,5,0,7};
        Integer[] test2 = {1,3,0,5,2};
        System.out.println(nextInt(test1));
        System.out.println(nextInt(test2));
    }
    
    public static int nextInt(Integer[] arr){
        List<Integer> arrList = Stream.of(arr).filter(x->x >= 0).sorted().collect(Collectors.toList());
        for(int i = 0;i < arrList.size()-1;i++){
            if((arrList.get(i)+1) != arrList.get(i+1)){
                return (arrList.get(i) +1);
            }
        }
        return arrList.get(arrList.size()-1);
    }
}
