package ge.edu.btu.demo2;

public class Main {
    public static void main(String[] args) {
        Sumable s = (int x, int y) -> {return x + y;};
        System.out.println(s.sum(2,3));
    }
}
