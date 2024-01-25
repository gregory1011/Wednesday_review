package week06_MethodsAndLoops;

public class SwapFirstLast {

    public static String swapFirstLastChar(String str){

        int lastIndex = str.length() -1;
        char first = str.charAt(0),
             last = str.charAt(lastIndex);
        String swapped = last + str.substring(1, lastIndex) + first;
        return swapped;

    }


    public static void main(String[] args) {
        System.out.println( swapFirstLastChar ("abol" ) );
    }
}
