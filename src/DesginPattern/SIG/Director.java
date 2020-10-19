package DesginPattern.SIG;

import DesginPattern.COR.Serve;
import DesginPattern.COR.ServeLevel;


// singleton Director
public class Director extends Serve {
    private static final Director DIRECTOR = new Director();
    private Director(){}
    public Director(ServeLevel serveLevel){
        super(serveLevel);
    }
    public static Director getDirector() {
        return DIRECTOR;
    }

    // director complain
    @Override
    public void writeMessage(String msg) {
        System.out.println("Customer complain !!");
    }
}
