public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "905000000", "TRH");
        Teacher t2 = new Teacher("Graham Bell","0000000","FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "111111", "BIO");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        tarih.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Necmi", "444","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
    }
}
