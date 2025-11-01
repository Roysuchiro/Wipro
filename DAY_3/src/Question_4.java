import java.util.Scanner;

public class Question_4 {
    double l,w,h;
    Question_4(){
        System.out.println("Constructor without parameter");
        System.out.println("Volume is 1000.0");
    }
    Question_4(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
        System.out.println("Constructor with parameter");
        System.out.println("Volume is "+(l*w*h));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Question_4 cuboid1 = new Question_4();
        double len = s.nextInt();
        double wid=s.nextInt();
        double hei=s.nextInt();
        Question_4 cuboid2 = new Question_4(len,wid,hei);
    }
}
