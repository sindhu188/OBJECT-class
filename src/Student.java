public class Student {
    int id;
    String name;

    void insertRecordOfStudent(int i, String n) {
         id = i;
         name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}
