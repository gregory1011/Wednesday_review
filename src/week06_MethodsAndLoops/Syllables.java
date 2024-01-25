package week06_MethodsAndLoops;

public class Syllables {

    public static int countSyllables(String str){

        int syllables = str.isEmpty() ? 0 : 1; // for the words 1 will the starting value , expect when the str is empty its value is zero

        for (int i = 0; i < str.length(); i++) {  // i < str.length() -1
            if ( str.charAt(i) == '-'){
                syllables++;
            }
        }

        return syllables;

    }  // end method


    public static void main(String[] args) {
        System.out.println("java " + countSyllables("ja-va"));
        System.out.println("hamburger "+ countSyllables("ham-bur-ger"));
        System.out.println("delivery "+countSyllables("de-li-ve-ry"));
        System.out.println("ball " + countSyllables("ball"));
        System.out.println("" + countSyllables(""));
    }
}
