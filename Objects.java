class Student {
    String name;
    String Branch;
    int marks;
}

public class Objects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Surya";
        s1.Branch = "IT";
        s1.marks = 89;
        Student s2 = new Student();
        s2.name = "Surya1";
        s2.Branch = "IT1";
        s2.marks = 69;

        Student students[] = new Student[2];

        students[0] = s1;
        students[1] = s2;

        // for(int i=0;i<students.length;i++){
        // System.out.println(students[i].name + " " + students[i].Branch);
        // }

        for (Student st : students) {
            System.out.println(st.name);
        }
    }
}