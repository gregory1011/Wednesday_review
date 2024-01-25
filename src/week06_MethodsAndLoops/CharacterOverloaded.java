package week06_MethodsAndLoops;

public class CharacterOverloaded {  // method , loop, overloaded

    public static String getCharactersSet(int start, int end){
        String result  = "";

        for ( ; start <= end; start++) {  // I don't need to initialize any variable
            // instead I am choosing to iterate though the start parameter.
            result += (char) start;
        }


        return result;
    }

    public static void main(String[] args) {

        System.out.println(getCharactersSet('7' , 'P'));
        System.out.println(getCharactersSet(50, 100));
    }

    // second method

    public static String getCharacterSet(String group) {

        String allCharacters = "";
        char start, end;

        switch (group.toLowerCase()) {
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digits":
            case "numbers":
                start = '0';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return "Invalid Group";
        }

        for (char letter = start; letter <= end; letter++) {  // start with 'A' and ends with 'Z'
            System.out.print((int) letter);
            allCharacters += letter;
        }
        System.out.println();
        return allCharacters;
    }

}
