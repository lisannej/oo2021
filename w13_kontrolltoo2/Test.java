package w13_kontrolltoo2;

public class Test {
    public static void main(String[] args) {
        Tahed tahed = new Tahed("pere");

        int num1 = tahed.numOfOccur('p');
        System.out.println("Tahte p esineb " + num1);

        int num2 = tahed.numOfOccur('a');
        System.out.println("Tahte a esineb " + num2);

        int num3 = tahed.numOfOccur('e');
        System.out.println("Tahte e esineb " + num3);
    }
}
