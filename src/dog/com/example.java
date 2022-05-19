package dog.com;

public class example {
    private String breedkama57094;

    Dog(){
        super();
        breedkama57094= "NN";
    }

    public Dog(String namekama57094 , int agekama57094,int weightkama57094,String rzadkama57094, String breedkama57094){
        super(namekama57094,agekama57094,weightkama57094,rzadkama57094);
        this.breedkama57094=breedkama57094;
    }

    public Dog(int agekama57094, String rzadkama57094, String breedkama57094){
        super(agekama57094,rzadkama57094);
        this.breedkama57094=breedkama57094;
    }

    public void sportkama57094(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkkama57094() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicekama57094() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    public String getBreedkama57094() {
        return breedkama57094;
    }

    public void setBreedkama57094(String breedkama57094) {
        this.breedkama57094 = breedkama57094;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedkama57094='" + breedkama57094 + '\'' +
                '}';
    }


}
