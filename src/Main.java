import java.util.Scanner;

public class Main {

    Measure measurements;
    Scanner scan = new Scanner(System.in);

    public Main() {
        int input=0;
        do {
            System.out.println("Healthy Apps");
            System.out.println("==========");
            System.out.println("1. View your BodyIdeal");
            System.out.println("2. View your BodyFluid");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            try {
                input = scan.nextInt();
            }catch (Exception e){
                input=0;
            }
            scan.nextLine();

            switch (input){
                case 1:
                    viewIdeal();
                    break;
                case 2:
                    viewFluid();
                    break;
            }
        }while(input !=3);
        System.out.println("Thankyou for using the HealthApps, stay healthy :)");
        scan.nextLine();
    }

    private int[] inputData(){
        int weight=0,height=0,age=0;
        int datas[] = {0,0,0};
        do {
            System.out.print("Input your weight [in KG]: ");
            try {
                weight = scan.nextInt();
            }catch (Exception e){
                weight=0;
            }
            scan.nextLine();
        }while (weight<1);

        do {
            System.out.print("Input your height [in CM]: ");
            try {
                height = scan.nextInt();
            }catch (Exception e){
                height=0;
            }
            scan.nextLine();
        }while (height<1);

        do {
            System.out.print("Input your age : ");
            try {
                age = scan.nextInt();
            }catch (Exception e){
                age=0;
            }
            scan.nextLine();
        }while (age<1);
        datas[0]=weight;
        datas[1]=height;
        datas[2]=age;
        return datas;
    }
    private void viewIdeal(){
       int datas[] = inputData();
       measurements = new BodyIdeal(datas[0],datas[1],datas[2]);
       measurements.calculateResult();

       scan.nextLine();
    }
    private void viewFluid(){
        int datas[] = inputData();
        measurements = new BodyFluid(datas[0],datas[1],datas[2]);
        measurements.calculateResult();
        scan.nextLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}
