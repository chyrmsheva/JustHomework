public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dogs: ");
        dog.setName("name:  Tommy");
        dog.setColour("colour:  Brown");
        dog.setBreed("breed: Labrador");
        dog.setAge(3);
        System.out.println(dog.getName());
        System.out.println(dog.getColour());
        System.out.println(dog.getBreed());
        System.out.println(dog.getAge());
        Dog dog1 = new Dog();
        dog1.setName("name: Molly");
        dog1.setColour("colour: white");
        dog1.setBreed("breed;  Labrador");
        dog1.setAge( 2);
        System.out.println(dog1.getName());
        System.out.println(dog1.getColour());
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

        System.out.println("---------------------------------------------------------------");

        Cat cat = new Cat();
        System.out.println("Cat: ");
        cat.setName("name: Murka");
        cat.setColour("colour: black");
        cat.setEyes("eyes: brown");
        cat.setGender("gender: M");
        System.out.println(cat.getName());
        System.out.println(cat.getColour());
        System.out.println(cat.getEyes());
        System.out.println(cat.getGender());
        System.out.println("---------------------------------------------------------------");

        Parrot parrot = new Parrot();
        System.out.println("Parrot: ");
        parrot.setName("name: Amazon");
        parrot.setColour("colour: Multicoloured");
        parrot.setCountry("country: Kanada");
        System.out.println(parrot.getName());
        System.out.println(parrot.getColour());
        System.out.println(parrot.getCountry());
        System.out.println("----------------------------------------------------------------");

        Fish fish = new Fish();
        System.out.println("Fish: ");
        fish.setName("name: Calamari");
        fish.setColour("colour: Blue");
        fish.setWeight(6);
        System.out.println(fish.getName());
        System.out.println(fish.getColour());
        System.out.println(fish.getWeight());


    }


//        Triangle triangle = new Triangle();
//        triangle.a = 5;
//        triangle.b = 5;
//        triangle.c = 5;
//
//        System.out.println(triangle.a+"."+triangle.b+"."+ triangle.c);
//        triangle.area();


}
