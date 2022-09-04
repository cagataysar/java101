public class ReaderTest {

    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.setName("Mahmut");
        reader1.setAge(45);
        reader1.setSex('M');

        Reader reader2 = new Reader();
        reader2.setName("Fatma");
        reader2.setAge(37);
        reader2.setSex('F');

        Book book1 = new Book();
        book1.setTitle("İnce Memed 2");
        book1.setPage(350);
        book1.setType("Roman");
        book1.setHardCover(false);
        book1.setCurrentPage(90);
        book1.setAuthor(new Author("Yaşar Kemal"));
        book1.reader = reader1;
        book1.readingStatus = new ReadingStatus();


        Book book2 = new Book();
        book2.setTitle("İçimizdeki Şeytan");
        book2.setPage(250);
        book2.setType("Roman");
        book2.setHardCover(false);
        book2.setCurrentPage(250);
        book2.setAuthor(new Author("Sabahattin Ali"));

        Book book3 = new Book();
        book3.setTitle("Kayıp Tanrılar Ülkesi");
        book3.setPage(294);
        book3.setType("Roman");
        book3.setHardCover(false);
        book3.setCurrentPage(0);
        book3.setAuthor(new Author("Ahmet Ümit"));


        System.out.println(reader1.name + " " + book1.author.name + " tarafından yazılan " + book1.type + " türündeki " + book1.title + " kitabını " + book1.getReadingStatus());
        //System.out.println(reader1.name + " : " + readingStatus.readingStatus(););
        System.out.println(reader2.name + " " + book2.author.name + " tarafından yazılan " + book2.type + " türündeki " + book2.title + " kitabını okuyor.");

    }
}
