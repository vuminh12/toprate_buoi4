package DesginPattern.CMD;

public class Complain implements Command{

    @Override
    public void excute() {
        System.out.println("I want to complain! ");
    }
}
