public class ERP {
    User []memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;

    void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    void printAllUsers(){
        for(int i = 0; i < sizeOfUsers; i++)
            System.out.println(memory[i].getUserData());
    }

    void printUser(int index){
        if(memory[index] == null)
            System.out.println("No such user in this index");
        else System.out.println(memory[index].getUserData());
    }
}