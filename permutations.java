package Kishorevel;
import java.util.*;
// Convert List<List<String>> to List<List<Integer>>
// Recursion
public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> intList = new ArrayList<>();
        for(List<String> stringList : permut("","123")){
            List<Integer> internal = new ArrayList<>();
            for(String s : stringList){
                internal.add(Integer.parseInt(s));
            }
            intList.add(internal);
        }
        System.out.println(intList);
    }

    static List<List<String>> permut(String p, String up){
        List<List<String>> outer = new ArrayList<>();
        if(up.isEmpty()){
            List<String> Internal = new ArrayList<>();
            Internal.add(p);
            outer.add(Internal);
            return outer;
        }
        char ch = up.charAt(0);
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            list.addAll(permut(f+ch+s,up.substring(1)));
        }
        return list;
    }
}
