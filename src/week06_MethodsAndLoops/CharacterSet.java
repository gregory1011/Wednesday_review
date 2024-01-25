package week06_MethodsAndLoops;

public class CharacterSet {  // method loops

    public static String getCharacterSet(String group){

        String allCharacters ="";
        char start, end ;

        switch (group.toLowerCase()){
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
            System.out.print ((int ) letter );
            allCharacters += letter;
        }
        System.out.println();
        return allCharacters;

    }

    public static void main(String[] args) {

        System.out.println(getCharacterSet("uppercase"));
        System.out.println(getCharacterSet("lowercase"));
        System.out.println(getCharacterSet("numbers"));
        System.out.println(getCharacterSet("special"));
        System.out.println(getCharacterSet("ok"));
    }

}
