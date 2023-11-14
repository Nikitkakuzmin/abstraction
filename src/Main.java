import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERP erp = new ERP();
        int studID = 0;
        int teachID = 0;

        while(true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();
            int choice2;
            if(choice == 0) break;
            else if(choice == 1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");

                choice2 = in.nextInt();

                if(choice2 == 1){
                    String login = in.next();
                    String password = in.next();
                    String name = in.next();
                    String surname = in.next();
                    String group = in.next();
                    double gpa = in.nextDouble();

                    erp.addUser(new Student(studID, login, password, name, surname, group, gpa));
                    studID++;

                }else if(choice2 == 2){
                    String login = in.next();
                    String password = in.next();
                    String nickname = in.next();
                    String status = in.next();

                    erp.addUser(new Teacher(teachID, login, password, nickname, status));
                    teachID++;

                    System.out.println(" PRESS [1] TO ADD SUBJECT");
                    System.out.println(" PRESS [0] TO FINISH ADDING SUBJECT");
                    choice2 = in.nextInt();
                    if(choice2 == 1){
                        String subject = in.next();
                        ((Teacher)erp.memory[erp.sizeOfUsers - 1]).addSubject(subject);
                    }

                }

            }else if(choice == 2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");

                choice = in.nextInt();
                if(choice == 1){
                    for(int i = 0; i < erp.sizeOfUsers; i++){
                        if(erp.memory[i] instanceof Student)
                            System.out.println(erp.memory[i].getUserData());
                    }
                }else if(choice == 2){
                    for(int i = 0; i < erp.sizeOfUsers; i++){
                        if(erp.memory[i] instanceof Teacher)
                            System.out.println(erp.memory[i].getUserData());
                    }
                }
            }else if(choice == 3){
                System.out.println("ENTER INDEX: ");
                int index = in.nextInt();
                erp.printUser(index);
            }
        }

    }
}
