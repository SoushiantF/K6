public class Cheetah extends Mammal implements  Hunter{
    @Override
    public void creatAnimal(String name, int age, int flightOrHeight, String special) {
        this.age=age;
        this.name=name;
        this.heightOrSpeed=flightOrHeight;
        this.specialAbility=special;
    }

    @Override
    public void show(){
        System.out.println("Name: "+name+" Age: "+age+" Speed :"+heightOrSpeed+" Speciality: "+specialAbility);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(this.name+" hunted "+ prey.getName());
    }

}
