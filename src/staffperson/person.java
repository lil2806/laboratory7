package staffperson;
import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class person {
   protected String Surnamekama57094, firstnamekama57094,streetkama57094,Zipkama57094,Citykama57094;
    public void Kama57094initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Surname:  ");
        Surnamekama57094 = br.readLine();
        System.out.println("firstname:  ");
        firstnamekama57094 =br.readLine();
        System.out.println("street:  ");
        streetkama57094 = br.readLine ();
        System.out.println("city:  ");
        Citykama57094 = br.readLine();
        System.out.println("zip:  ");
        Zipkama57094 = br. readLine();





    }
    public void Kama57094print(){
        System.out.println("Surname" + Surnamekama57094);
        System.out.println("firstname" + firstnamekama57094);
        System.out.println("street" + streetkama57094);
        System.out.println("zip" + Zipkama57094);
        System.out.println("city" + Citykama57094);





    }
}

class Staff extends person {
   protected String kama57094education , kama57094Position;
    public void kama57094Initialize1()throws IOException{
        kama57094Initialize1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Education: ");
       kama57094education = sc.nextLine();
        System.out.println("Enter your Position");
        kama57094Position = sc.nextLine();
    }

    public void Kama57094print1(){

        System.out.println("Education: " + kama57094education);
        System.out.println("Position: "+ kama57094Position);
    }

}

class Main {

    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();
        new Staff.kama57094initialize();
       new Staff.kama57094print();




    }
}






