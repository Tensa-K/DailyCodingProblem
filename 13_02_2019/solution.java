import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Integer[] test1 = {1, 2, 3, 4, 5};
        Integer[] test2 = {3, 2, 1};
        Integer[] zeroTest = {1, 2, 3, 0};
        System.out.println(Arrays.asList(productArray(test1)));
        System.out.println(Arrays.asList(productArray(test2)));
        System.out.println(Arrays.asList(productArray(zeroTest)));
    }
    
    public static Integer[] productArray(Integer arr[]){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            int valueToAdd = 0;
            for(int j = 0;j<arr.length;j++){
                if(i != j){
                    //this statement is defined in order to manage the zero value
                    if(arr[j] == 0){
                        valueToAdd = 0;
                        break;
                    }
                    else if(valueToAdd == 0){
                        valueToAdd = arr[j];
                    }
                    else if(arr[j] != 0){
                        valueToAdd = valueToAdd * arr[j];
                    }
                }
            }
            newArray.add(valueToAdd);
        }
        return newArray.toArray(new Integer[newArray.size()]);
    }
}
