package bird.com;

public class example {
    private String featherColorkama57094;



    public Bird(){
        super();
        featherColorkama57094="NN";

    }

    public Bird (String namekama57094, int agekama57094 int weightkama57094, String featherColorkama57094){
        super(namekama57094, agekama57094, weightkama57094);
        this.featherColorkama57094=featherColorkama57094;
    }

    public Bird(int agekama57094, String featherColorkama57094){
        super(agekama57094);
        this.featherColorkama57094=featherColorkama57094;
    }

    public void takingFlightkama57094(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicekama57094() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColorkama57094() {
        return featherColorkama57094;
    }

    public void setFeatherColorkama57094(String featherColorkama57094) {
        this.featherColorkama57094 = featherColorkama57094;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorkama57094='" + featherColorkama57094 + '\'' +
                '}';
    }




}
