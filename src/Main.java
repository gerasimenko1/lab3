public class Main {
    public static void main(String[] args){
        long l = 123456;
        double d1, d2;
        float f = (float) 14.75;
        char c1 = '0';
        d1 = Math.random() * (1000 - 100) + 100;
        System.out.println("d1 " + d1);
        d2 = ((Math.random() * (99-1)+1));
        System.out.println("d2 " + d2);

        double y = Math.sin(d1)*Math.cos(d2)- Math.atan(d1)/Math.atan(d2);
            System.out.println("y = " + y);
    }
}