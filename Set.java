package set;

import java.util.HashSet;


public class Set{
public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    if(set.contains(1)){
        System.out.println("1");
    }else{
        System.out.println("not 1");
    }
    set.add(6);
    set.remove(3);
    int lenght = set.size();
    System.out.println("Lenght set:" +lenght);
    for(Integer element : set){
        System.out.println(element);
        }
    }
}
