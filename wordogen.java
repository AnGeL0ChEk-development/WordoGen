import java.lang.*;
import java.util.Scanner;


public class wordogen {



    public static void main(String[] args) {
        System.out.println("How many lines of text do you like to generate?");
        Scanner f_or = new Scanner(System.in);
        double f__or = f_or.nextDouble();
        while (true){
            String[] gentext;
            gentext = new String[7];
            String[] hello;
            hello = new String[5];
            hello[0] = "Hello, ";
            hello[1] = "Hi, ";
            hello[2] = "Hi boy, ";
            hello[3] = "Hi girl, ";
            hello[4] = "Hey you, ";
            int hellor = (int) getRandomDoubleBetweenRange(1,5);
            if (hellor == 1){
                gentext[0] = hello[0];
            }
            if (hellor == 2){
                gentext[0] = hello[1];
            }
            if (hellor == 3){
                gentext[0] = hello[2];
            }
            if (hellor == 4){
                gentext[0] = hello[3];
            }
            if (hellor == 5){
                gentext[0] = hello[4];
            }
            int guestionsr = (int) getRandomDoubleBetweenRange(1,5);
            String[] questions;
            questions = new String[5];
            questions[0] = "what do you do together?";
            questions[1] = "nice to meet you!";
            questions[2] = "do you play yesterday?";
            questions[3] = "school is boringiest place in the world!";
            questions[4] = "do you like cola?";

            if (guestionsr == 1){
                gentext[1] = questions[0];
            }
            if (guestionsr == 2){
                gentext[1] = questions[1];
            }
            if (guestionsr == 3){
                gentext[1] = questions[2];
            }
            if (guestionsr == 4){
                gentext[1] = questions[3];
            }
            if (guestionsr == 5){
                gentext[1] = questions[4];
            }
            int learnr = (int) getRandomDoubleBetweenRange(1,5);
            String[] learn;
            learn = new String[5];
            learn[0] = "We learned French!";
            learn[1] = "We learned English!";
            learn[2] = "We learned Russian!";
            learn[3] = "We learned Ukrainian!";
            learn[4] = "We learned Italian!";

            if (learnr == 1){
                gentext[2] = learn[0];
            }
            if (learnr == 2){
                gentext[2] = learn[1];
            }
            if (learnr == 3){
                gentext[2] = learn[2];
            }
            if (learnr == 4){
                gentext[2] = learn[3];
            }
            if (learnr == 5){
                gentext[2] = learn[4];
            }
            int marksr = (int) getRandomDoubleBetweenRange(1,5);
            String[] marks;
            marks = new String[5];
            marks[0] = "My mark is 2!";
            marks[1] = "My mark is 7!";
            marks[2] = "My mark is 5!";
            marks[3] = "My mark is 12!";
            marks[4] = "My mark is 10!";

            if (marksr == 1){
                gentext[3] = marks[0];
            }
            if (marksr == 2){
                gentext[3] = marks[1];
            }
            if (marksr == 3){
                gentext[3] = marks[2];
            }
            if (marksr == 4){
                gentext[3] = marks[3];
            }
            if (marksr == 5){
                gentext[3] = marks[4];
            }
            int inschoolr = (int) getRandomDoubleBetweenRange(1,5);
            String[] inschool;
            inschool = new String[5];
            inschool[0] = "I have  Science, Math, English, Russian, Italian!";
            inschool[1] = "I have  PE, Math, Russian, Italian!";
            inschool[2] = "I have  Biology, Math, English, Russian!";
            inschool[3] = "I have  Science, Math, Biology, Russian, Italian!";
            inschool[4] = "I have  PE, Math, English, Russian, Biology!";

            if (inschoolr == 1){
                gentext[4] = inschool[0];
            }
            if (inschoolr == 2){
                gentext[4] = inschool[1];
            }
            if (inschoolr == 3){
                gentext[4] = inschool[2];
            }
            if (inschoolr == 4){
                gentext[4] = inschool[3];
            }
            if (inschoolr == 5){
                gentext[4] = inschool[4];
            }
            gentext[5] = "Created by AnGeL0ChEk11";

            int lovehomeworkr = (int) getRandomDoubleBetweenRange(1,5);
            String[] lovehomework;
            lovehomework = new String[5];
            lovehomework[0] = "I dont like this school because its boring!";
            lovehomework[1] = "I dont like my schhol because its boring!";
            lovehomework[2] = "I dont like ny school because i hava different marks!";
            lovehomework[3] = "I dont like ny school because yesterday i have 2!";
            lovehomework[4] = "I like my school!";

            if (lovehomeworkr == 1){
                gentext[6] = lovehomework[0];
            }
            if (lovehomeworkr == 2){
                gentext[6] = lovehomework[1];
            }
            if (lovehomeworkr == 3){
                gentext[6] = lovehomework[2];
            }
            if (lovehomeworkr == 4){
                gentext[6] = lovehomework[3];
            }
            if (lovehomeworkr == 5){
                gentext[6] = lovehomework[4];
            }
            System.out.println(gentext[0]+ gentext[1] + gentext[2] + gentext[3] + gentext[4] + gentext[5] + gentext[6]);

            f__or = f__or - 1;
            if (f__or == 0){
                Scanner forcopy = new Scanner(System.in);
                int forcopyscan = forcopy.nextInt();
                System.exit(0);


            }


        }
    }
    public static double getRandomDoubleBetweenRange(double min, double max){
        return (int) ((Math.random()*((max-min)+1))+min);
    }
}
