package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Test {
    public static void main(String[] args) {
        Animal animal[] = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for(Animal animal1: animal){
            System.out.println(animal1.makeSound());

            if(animal1 instanceof Chicken){
                Edible edible = new Chicken();
                System.out.println(edible.howToEat());
                //System.out.println(((Chicken) animal1).howToEat());
            }
        }

        Fruit fruit[] = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();

        for (Fruit fruit1: fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
