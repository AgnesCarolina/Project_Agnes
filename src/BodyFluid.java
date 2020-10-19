public class BodyFluid extends Measure{

    public BodyFluid(int weight, int height, int age) {
        super(weight, height, age);
    }

    @Override
    public void calculateResult() {
        System.out.println("Your daily drink intake : "+Math.round(weight*0.033) + " liters / day");
        System.out.println("Ganbattee");
    }
}
