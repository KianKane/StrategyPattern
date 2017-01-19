package strategypattern;

import strategypattern.flying.IFlyingBehaviour;

public class Vehicle
{
    protected IFlyingBehaviour flyingBehaviour;
    
    public void fly(){
        flyingBehaviour.fly();
    }
    
    public void setFlyingBehaviour(IFlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
}