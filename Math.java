import java.util.Scanner;
public class Math{
    public static void main(String[] args){
        Scanner sys = new Scanner(System.in);
        
        Operations ops = new Operations();
        System.out.println("Input Addition, Subtraction, Multiplication, or Division");
        String string = sys.nextLine();
        if(string.equals("Addition") || string.equals("addition")){
            System.out.println("Input X");
            Double x = Double.valueOf(sys.nextLine());
            System.out.println("Input Y");
            Double y = Double.valueOf(sys.nextLine());
            System.out.println(ops.add(x,y));
        } else if(string.equals("Subtraction") || string.equals("subtraction")){
            System.out.println("Input X");
            Double x = Double.valueOf(sys.nextLine());
            System.out.println("Input Y");
            Double y = Double.valueOf(sys.nextLine());
            System.out.println(ops.sub(x,y));
        } else if(string.equals("Multiplication") || string.equals("multiplication")){
            System.out.println("Input X");
            Double x = Double.valueOf(sys.nextLine());
            System.out.println("Input Y");
            Double y = Double.valueOf(sys.nextLine());
            System.out.println(ops.mult(x,y));
        } else if(string.equals("Division") || string.equals("division")){
            System.out.println("Input X");
            Double x = Double.valueOf(sys.nextLine());
            System.out.println("Input Y");
            Double y = Double.valueOf(sys.nextLine());
            System.out.println(ops.div(x,y));
        } else {
            System.out.println("Input invalid.");
        }
        sys.close();
    }
}
