package w13_kontrolltoo2;

//* Kõik lausetes leidunud eri sõnad lisatakse faili. Rakenduse väljundis näidatakse, millised sõnad on sisendlausest uued ning millised juba varem olemas olnud. 

public class Tahed implements Liides{

    String sona = "";

    public Tahed(String abc){
        sona = abc;
    }

    public int numOfOccur(char c){
        //Scanner in = new Scanner(System.in);
        char inLetter = c;
        String sentence = sona;
        //System.out.println("Enter a character for which to search");
       // inLetter = in.next().charAt(0);
        //System.out.println("Enter the string to search");
        //sentence = in.next();

        int letter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (inLetter == ch) {
                letter++;
            }
        }

        System.out.print(sentence.charAt(letter));
        return letter;
    }
}