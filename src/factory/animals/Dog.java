package factory.animals;

class Dog implements IAnimal
{
    @Override public void speak(){
        System.out.println("Woof");
    }
}
