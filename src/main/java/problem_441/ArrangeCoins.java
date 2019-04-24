package problem_441;


public class ArrangeCoins {
    public static void main(String[] args) {
        ArrangeCoins arrangeCoins = new ArrangeCoins();
        int x = arrangeCoins.arrangeCoins(1804289383);
        System.out.println(x);
    }

    public int arrangeCoins(int n) {
        double no = -1 * (-1 - (Math.sqrt(1) +( Math.sqrt(8) * Math.sqrt(n))) / 2);
//        System.out.println(no);
        return (int) no  - 2;
    }
}
