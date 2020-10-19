public class BodyIdeal extends Measure{

    public BodyIdeal(int weight, int height, int age) {
        super(weight, height, age);
    }

    @Override
    public void calculateResult() {
        System.out.println("Height : "+height);
        float result = ((height-100)-(height-100)*(15/100));
        System.out.println("Your IdealBodyWeight (IBW) : "+result+" kg");
        if(weight == result){
            System.out.println("You're ideal :D");
        }else{
            System.out.println("You're less ideal :(");
        }
    }
}
