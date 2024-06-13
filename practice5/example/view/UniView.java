package practice5.example.view;

import java.util.Scanner;

public class UniView {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1 - Operations with Student");
            System.out.println("2 - Operations with Teacher");
            System.out.println("3 - Operations with Student Groups");
            System.out.println("4 - Exit the program");

            switch (scanner.nextInt()) {
                case 1 -> new StudentView().start();
                case 2 -> new TeacherView().start();
                case 3 -> new StudentGroupView().start();
                case 4 -> System.exit(0);
            }
        }
    }
}
