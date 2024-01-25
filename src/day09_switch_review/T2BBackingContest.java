package day09_switch_review;

import java.sql.SQLOutput;

public class T2BBackingContest {

    public static void main(String[] args) {
        String habitat = "jungle", animals = "";

        switch (habitat) {
            case "grasslands":
                animals = "goats, bison, badgers, coyotes";
            break;
            case "jungle":
                animals= "snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                animals = "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                animals="lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                System.out.println("No data for "+ habitat);

                System.out.println("In the "+ habitat+" you will be able to find: "
                        + animals);

        }


    }

}
