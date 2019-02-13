import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        System.out.println(checkAddUp(new ArrayList<Integer>(Arrays.asList(10,15,3,7)),17));
        System.out.println(checkAddUp(new ArrayList<Integer>(Arrays.asList(10,15,3,7)),100));
    }
    
    public static boolean checkAddUp(List<Integer> list, int k){
        boolean state = false;
        Iterator<Integer> ite = list.iterator();
        while(ite.hasNext()){
            int i = ite.next();
            for(int index = 0; index < list.size(); index++){
                if((i + list.get(index)) == k){
                    return !state;
                }
                if(index == list.size()-1){
                    ite.remove();
                }
            }
        }
        return state;
    }
}
