public class ReaderTest {

    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.name = "Mahmut";
        reader1.age = 47;
        reader1.sex = 'M';

        Reader reader2 = new Reader();
        reader2.name = "Meral";
        reader2.age = 35;
        reader2.sex = 'F';

        Book book1 = new Book();
        book1.title = "İnce Memed 1";
        book1.page = 350;
        book1.type = "Roman";
        book1.isHardCover = false;
        book1.currentPage = 89;
        book1.author = new Author("Yaşar Kemal");
        book1.reader = reader1;
        book1.readingStatus = new ReadingStatus();


        Book book2 = new Book();
        book2.title = "İçimizdeki Şeytan";
        book2.page = 220;
        book2.type = "Roman";
        book2.isHardCover = false;
        book2.currentPage = 220;
        book2.author = new Author("Sabahattin Ali");

        Book book3 = new Book();
        book3.title = "Kayıp Tanrılar Ülkesi";
        book3.page = 315;
        book3.type = "Novel";
        book3.isHardCover = false;
        book3.currentPage = 0;
        book3.author = new Author("Ahmet Ümit");


        System.out.println(reader1.name + " " + book1.author.name + " tarafından yazılan " + book1.type + " türündeki " + book1.title + " kitabını " + book1.getReadingStatus());
        //System.out.println(reader1.name + " : " + readingStatus.readingStatus(););
        System.out.println(reader2.name + " " + book2.author.name + " tarafından yazılan " + book2.type + " türündeki " + book2.title + " kitabını okuyor.");

    }
}
