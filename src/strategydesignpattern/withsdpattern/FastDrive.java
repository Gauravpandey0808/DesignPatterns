package strategydesignpattern.withsdpattern;

public class FastDrive implements Drive{

    @Override
    public void driving() {
        System.out.println("This is fast driving skill");
    }
}
