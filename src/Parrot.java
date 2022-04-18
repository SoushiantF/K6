public class Parrot extends Bird implements Prey{
    @Override
    public void creatAnimal(String name, int age, int flightOrHeight, String special) {
        this.age=age;
        this.name=name;
        this.heightOrSpeed=flightOrHeight;
        this.specialAbility=special;
    }

    @Override
    public void show(){
        System.out.println("Name: "+name+" Age: "+age+" Flight height :"+heightOrSpeed+" Speciality: "+specialAbility);
    }

    @Override
    public String getName() {
        return name;
    }
}
