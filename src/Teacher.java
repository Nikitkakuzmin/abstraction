public class Teacher extends User{
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;

    }

    public String getNickName() {
        return nickName;
    }

    public String getStatus() {
        return status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects ++;
    }

    @Override
    String getUserData() {
        String data = id + " " + login + " " + password + " " + nickName + " " + status + " ";
        for(int i = 0; i < sizeOfSubjects;i++){
            data += subjects[i] + " ";}
        return data;
    }

}