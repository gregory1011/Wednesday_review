package week12.hero;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SuperHero {

    private String superHeroName, realName, universe;
    private ArrayList<String> powers;

    public SuperHero(String superHeroName, String realName, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.powers = new ArrayList<>(powers);
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public void protect(){
        System.out.println(superHeroName + " protecting");
    }

    public String toString (){
        return superHeroName + " from "+ universe+ " The have powers:\n"+ powers;

    }

}
