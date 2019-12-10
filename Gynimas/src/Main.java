import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int pazymejoNr, String vardas, String pavarde,String gimimoData, String grupe, double vidurkis//
        Fakultetas studentas1 = new Fakultetas(123,"Matas", "Urbanavicius","1999/06/11","1", 5.5);
        Fakultetas studentas2 = new Fakultetas(456,"Linas", "Pavardenis","2007/07/03", "2", 6.7);
        Fakultetas studentas3 = new Fakultetas(789, "Renatas", "Palinauskas", "1999/11/30","3",9.3);
        Fakultetas studentas4 = new Fakultetas(321,"Aidas", "Rakauskas", "2001/02/22","4", 3.5);
        Fakultetas studentas5 = new Fakultetas(654,"Kipras", "Svid","1995/04/05","5" ,4.5);
        Fakultetas studentas6 = new Fakultetas(987,"Kestis","Prikolas", "2000/09/12","6",8.2);
        Fakultetas studentas7 = new Fakultetas(159,"Rokas","Nesakysiu", "2000/03/10","7",5.2);
        Fakultetas studentas8 = new Fakultetas(357,"Mindaugas","Pasakysiu", "1997/09/15","8",2.5);
        Fakultetas studentas9 = new Fakultetas(155,"Mantas","Skaiciai", "1996/12/12","9",7.3);
        Fakultetas studentas10 = new Fakultetas(681, "Birelis","Bepavardis", "1997/05/03","10",9.00);

        ArrayList<Fakultetas> grupe = new ArrayList<>();
        grupe.add(studentas1);
        grupe.add(studentas2);
        grupe.add(studentas3);
        grupe.add(studentas4);
        grupe.add(studentas5);
        grupe.add(studentas6);
        grupe.add(studentas7);
        grupe.add(studentas8);
        grupe.add(studentas9);
        grupe.add(studentas10);

        System.out.println("Fakulteto studentai");
        System.out.println(grupe);

        }

        public int gautiFakultetoStudentus(String grupe, ArrayList)



}
