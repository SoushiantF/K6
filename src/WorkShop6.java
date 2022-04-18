import java.util.ArrayList;

class WorkShop6 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(); Parrot parrot = new Parrot(); Cheetah cheetah = new Cheetah(); Giraffe giraffe = new Giraffe();
        eagle.creatAnimal("Eagle",5,100,"Lonely hunter");
        parrot.creatAnimal("Parrot",20,30,"Talkative");
        cheetah.creatAnimal("Cheetah", 7, 90, "Fastest mammal");
        giraffe.creatAnimal("Giraffe",25,40,"Tallest one");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eagle); animals.add(parrot); animals.add(cheetah); animals.add(giraffe);
        for(int i =0;i<animals.size();i++){
            System.out.print((i+1)+". ");
            animals.get(i).show();
        }
        ((Hunter) (animals.get(0))).hunt((Prey)(animals.get(1)));
    }
}