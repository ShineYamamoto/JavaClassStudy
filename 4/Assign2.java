public class Assign2 {
    public static void main(String[] args) {

        // 預金額、倍率
        int deposit = 10000;
        double rate = 1.1;

        // 1年目
        deposit *= rate;
        System.out.println(deposit);

        // 2年目
        deposit *= rate;
        System.out.println(deposit);

        // 3年目
        deposit *= rate;
        System.out.println(deposit);

        // 4年目
        deposit *= rate;
        System.out.println(deposit);

        // 5年目
        deposit *= rate;
        System.out.println(deposit);
    }
}
