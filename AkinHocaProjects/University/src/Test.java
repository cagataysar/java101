public class Test {

    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";
        Department department2 = new Department();
        department2.name = "Philosophy";

        Professor professor1 = new Professor();
        professor1.name = "Akin Kaldiroglu";
        Professor professor2 = new Professor();
        professor2.name = "Ahmet Arslan";
        Professor professor3 = new Professor();
        professor3.name = "Takiyüddin Mengüşoğlu";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";
        Course course2 = new Course();
        course2.name = "Ethics";
        Course course3 = new Course();
        course3.name = "Ontology";

        Student student1 = new Student();
        student1.name = "Çağatay Sarioglan";
        Student student2 = new Student();
        student2.name = "Zeynep Gül";
        Student student3 = new Student();
        student3.name = "Metin Sağlam";
        Student student4 = new Student();
        student4.name = "Murat Atılgan";

        Classroom classroom1 = new Classroom();
        classroom1.name = "ZK202";
        classroom1.courses = new Course[20];
        classroom1.courses[0] = course1;

        Classroom classroom2 = new Classroom();
        classroom2.name = "NK402";
        classroom2.courses = new Course[20];
        classroom2.courses[0] = course2;


        department1.head = professor1;
        professor1.department = department1;

        department2.head = professor2;
        professor2.department = department2;

        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course2.department = department2;
        department2.courses = new Course[50];
        department2.courses[0] = course2;
        course2.teacher = professor2;

        course3.department = department2;
        department2.courses = new Course[50];
        department2.courses[0] = course3;
        course3.teacher = professor3;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        student2.coursesTaken = new Course[7];
        student2.coursesTaken[0] = course2;

        student3.coursesTaken = new Course[7];
        student3.coursesTaken[0] = course3;

        student4.coursesTaken = new Course[7];
        student4.coursesTaken[0] = course3;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student " + student1.name + "'s first course is " + student1.coursesTaken[0].name);
        System.out.println("Course of " + course1.name + " is in " + classroom1.name + " classroom.");
        System.out.println("Name of student " + student1.name + "'s first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student " + student1.name + "'s first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
        System.out.println();
        System.out.println("Name of student " + student2.name + "'s first course is " + student2.coursesTaken[0].name);
        System.out.println("Name of student " + student2.name + "'s first course's professor is " + student2.coursesTaken[0].teacher.name);
        System.out.println("Name of student " + student2.name + "'s first course's professor's department is " + student2.coursesTaken[0].teacher.department.name);
        System.out.println();
        System.out.println("Name of student " + student3.name + "'s first course is " + student3.coursesTaken[0].name);
        System.out.println("Name of student " + student3.name + "'s first course's professor is " + student3.coursesTaken[0].teacher.name);
        System.out.println("Name of student " + student3.name + "'s first course's professor's department is " + student3.coursesTaken[0].teacher.department.name);
        System.out.println();
        System.out.println("Name of student " + student4.name + "'s first course is " + student4.coursesTaken[0].name);
        System.out.println("Name of student " + student4.name + "'s first course's professor is " + student4.coursesTaken[0].teacher.name);
        System.out.println("Name of student " + student4.name + "'s first course's professor's department is " + student4.coursesTaken[0].teacher.department.name);
        System.out.println();

    }
}
