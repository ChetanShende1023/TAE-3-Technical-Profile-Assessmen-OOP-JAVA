/* 
 * 17. Download Manager
 * Create a class DownloadManager. Create multiple threads using
 * Runnable interface. Each thread represents file download.
 * Output: Downloading messages.
 */
class DownloadManager implements Runnable {
    private String fileName;

    public DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + "...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("Document.pdf"));
        Thread t2 = new Thread(new DownloadManager("Image.jpg"));
        Thread t3 = new Thread(new DownloadManager("Music.mp3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
