package DesginPattern.COR;

import DesginPattern.COR.Serve;

public class Staff  extends Serve {

    public Staff(ServeLevel serveLevel){
        super(serveLevel);
    }

    @Override
    public void writeMessage(String msg) {
        System.out.println("staff message: "+ msg);
    }
}
