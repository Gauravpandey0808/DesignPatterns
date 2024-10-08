package behaviouraldesignpattern.strategydesignpattern.withsdpattern;

public class NoDriving implements Drive{
    @Override
    public void driving() {
        System.out.println("You won't be able to drive it");
    }
}
