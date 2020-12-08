package ge.edu.btu.demo3;

public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        iphoneX.title="Iphone X";

        Nokia nokia = new Nokia();
        nokia.title="Nokia lumia";
        printSmartphone(iphoneX);
        printSmartphone(nokia);
    }

    public static <Smartphone> void printSmartphone(Smartphone x){
        System.out.println("ეს სმარტფონია");
    }
    public static <Simbian> void printSimbian(Simbian x){
        System.out.println("ეს სიმბიანია");
    }
}
