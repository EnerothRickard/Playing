public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        String str;
        System.out.println("Hello world!");
        a = 2;
        b = 6;
        str = "Testing...";
        for(int i=0;i<4;i++) {
            System.out.println(a + b + i);
        }
        System.out.println(str);
        metod1();
        DelPrg d = new DelPrg();
        d.metod2();
    }

    public static void metod1() {
        System.out.println("metod1");
    }
}