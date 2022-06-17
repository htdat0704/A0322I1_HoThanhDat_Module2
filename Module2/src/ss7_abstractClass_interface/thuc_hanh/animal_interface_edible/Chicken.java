package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "cục tát";
    }

    @Override
    public String howToEat(){
        return "ăn luôn cho lóng";
    }
}
