public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecordOfStudent(101,"ABC");
        s2.insertRecordOfStudent(102,"CDA");

        s1.displayInformation();
        s2.displayInformation();
    }
}
