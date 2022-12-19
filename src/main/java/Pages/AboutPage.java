package Pages;

public class AboutPage extends Page implements PageInterface{

    String Disclamer;

    public String getDisclamer(){
        return Disclamer;
    }

    public void setDisclamer(String disclamer){
        Disclamer=disclamer;
    }

    public void getDeveloperName(){
        System.out.println("Mary Jones");
    }

}
