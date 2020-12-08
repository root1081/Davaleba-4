package ge.edu.btu.demo1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> myset = new HashSet<String>();
        myset.add("rati");
        myset.add("gio");
        myset.add("beka");
        for(String x : myset){
            System.out.println(x);
        }
    }
}
