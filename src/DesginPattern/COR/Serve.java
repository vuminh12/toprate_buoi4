package DesginPattern.COR;

public abstract class Serve {
    public Serve nextServer;
    public ServeLevel serveLevel;

    public Serve(ServeLevel serveLevel) {}

    public Serve() {}

    public Serve setNext(Serve nextServer){
         this.nextServer = nextServer;
         return nextServer;
     }
     public void check(ServeLevel level,String msg){
         if(serveLevel.getLevel() == level.getLevel()){
             writeMessage(msg);
         }
         if (nextServer != null) {
             nextServer.check(level, msg);
         }
     }
     public abstract void writeMessage(String msg);


}
