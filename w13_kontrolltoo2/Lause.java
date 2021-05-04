package w13_kontrolltoo2;
//* Loo liidest realiseeriv klass Lause. Lauselt saab lisaks küsida sõnade arvu ning Sõna-klassi eksemplaride massiivi.
// Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv terves lauses ning igas sõnas eraldi. 
//Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.
    import java.util.Scanner;
    public class Lause {
        public static int countWords(String str)
            {
                int count = 1;
                for(int i=0; i<=str.length()-1; i++)
                {
                    if(str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
                    {
                        count++;
                    }
                }
                return count;
            }
        public static void main(String args[])
        {
                String sentence;
                Scanner scan = new Scanner(System.in);
                
                System.out.print("Sisesta lause : ");
                sentence = scan.nextLine();
                
                System.out.print("Lauses on  " + countWords(sentence) + " sõna.");
        }
    }

