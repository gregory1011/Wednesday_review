package week12.hero;

import java.util.ArrayList;

public class Marvel extends SuperHero{
    public Marvel(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    public void CallAvengers (){
        System.out.println("Calling all avengers");
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println("by any means necessary");
    }
}
