package week06_MethodsAndLoops;

public class Extra {
    public static String swapChars(String str, int firstIndex, int secondIndex){

        if (firstIndex >= secondIndex  || firstIndex == secondIndex ||
                secondIndex >= str.length() ){
         return str;
        }

        String result ="";

        char firstChar = str.charAt(firstIndex);
        char secondChar = str.charAt(secondIndex);

        result += str.substring(0, firstIndex) + secondChar +
                str.substring(firstIndex +1, secondIndex) +
                firstChar + str.substring(secondChar+1);
        return result;

    }

    public static void main(String[] args) {

        System.out.println(swapChars("humburger", 3, 6));
    }
}
