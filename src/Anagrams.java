import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagrams(String a,String b){
        // For main Coding
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean r=false;
        StringBuilder c=new StringBuilder(b);
        if (a.length()==b.length()){
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < c.length(); j++) {
                    if (a.charAt(i)==c.charAt(j)){
                        c.deleteCharAt(j);
                        if (i==a.length()-1&&c.length()==0){
                            r=true;
                            break;
                        }
                    break;
                    }

                    
                }

            }
        }return r;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
        boolean r=isAnagrams(a,b);
        System.out.println((r) ?    "Anagrams":"Not Anagrams");
    }
}
