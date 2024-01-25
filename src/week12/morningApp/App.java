package week12.morningApp;

public class App {


    String name ;
    double version;

    public App(double version){
        this.name = getClass().getSimpleName();
        this.version = version;
    }

    public void download (){
        System.out.println(name + " is downloading version "+ version);
    }





}
