public class Reader {

    String name;
    int age;
    char sex;
    Book book;

    public Reader(String name) {
        this.name = name;
    }

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    void read(Book book) {

    }
}
