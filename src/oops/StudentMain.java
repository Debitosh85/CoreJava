package oops;

public class StudentMain {

    public static void main(String[] args) {

        Student st = new Student("Subham", 111, 5.4, "Puri");
        System.out.println(st);

        System.out.println("After Updating Student Database");

        st.setStudentName("Piku");
        st.setStudentId(st.getStudentId());
        st.setStudentAddress(st.getStudentAddress() + "Old");

        System.out.println(st);

    }

}
