package DesginPattern.COR;

import DesginPattern.SIG.Director;

public class ServeProcess {
    public static Serve getServe(){
        Serve Staff = new Staff(ServeLevel.STAFF);
        Serve Leader = Staff.setNext(new Leader(ServeLevel.LEADER));
        Leader.setNext(new Director(ServeLevel.DIRECTOR));
        return Staff;
    }
}
