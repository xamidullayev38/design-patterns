public class Main {
    public static void main(String[] args) {

        // Fayllar
        File resume = new File("resume.pdf");
        File homework = new File("homework.docx");
        File photo1 = new File("photo1.jpg");
        File photo2 = new File("photo2.jpg");
        File music = new File("music.mp3");

        // Papkalar
        Folder documents = new Folder("Documents");
        documents.add(resume);
        documents.add(homework);

        Folder photos = new Folder("Photos");
        photos.add(photo1);
        photos.add(photo2);

        Folder computer = new Folder("Computer");
        computer.add(documents);
        computer.add(photos);
        computer.add(music);

        // Butun strukturani chiqarish
        System.out.println("===== Fayl tizimi =====");
        computer.show();

        // remove() ni sinab ko'ramiz
        System.out.println();
        System.out.println("===== photo2.jpg va music.mp3 o'chirildi =====");
        photos.remove("photo2.jpg");
        computer.remove(music);
        computer.show();
    }
}
