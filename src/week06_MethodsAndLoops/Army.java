package week06_MethodsAndLoops;

public class Army {

    public static void  eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen){

        if(age >=18 && age<=35 && hasDiploma && isCitizen){
            System.out.println("You are qualified to join Army");
        }else{
            // invalid data
            System.out.println("You are NOT qualified to join the Army");

            if (age <18){
                System.out.println(age+ " is less than our minimum age");
            }else if(age >35){
                System.out.println(age+ " is less than our maximum age");
            }

            if(! hasDiploma){
                System.out.println("You must have a high diploma");
            }
            if (! isCitizen){
                System.out.println("You must be a citizen");
            }
        } /// end of else statement

    } // method ends


    public static void main(String[] args) {
        eligibleForArmy(25, true, true);
    }
}
