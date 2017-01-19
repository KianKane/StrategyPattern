package strategypattern;

public class FlyWithWings implements IFlyingBehaviour
{
    @Override public void fly(){
        System.out.println("Flying with wings!");
    }
}
