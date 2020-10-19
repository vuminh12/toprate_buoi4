package DesginPattern.COR;

public class Leader extends Serve{

    public Leader(ServeLevel serveLevel){
        super(serveLevel);
    }
    @Override
    public void writeMessage(String msg) {
        System.out.print("Leader message:"+ msg);
    }
}
