package main.com;

public class example {
    public static void main(String[] args) {

        Animal animal[]= new Animal[6];

        animal[0]=new Mammal("Little brown",2,3,"Bat");
        animal[1]=new Dog("Tom",3,16,"Carnivora","German Shepard");
        animal[2]=new Fish("CatFish",2,1,"Yellow");
        animal[3]=new BlowFish("Kevin",2,5,"Purple",10);
        animal[4]=new Bird("Falcon",4,10,"Brown");
        animal[5]=new Pigeon("Smith",3,4,"Grey","Argentina");

        animal[2].getVoicekama57094();
        animal[4].getVoicekama57094();

    }

}
