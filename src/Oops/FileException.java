package Oops;

public class FileException {

	public FileException(String string) {
	}
	public static void main(String[] args) throws InterruptedException {
		FileException f= new FileException("E://Book.xlsx");
		System.out.println("Start");
		Thread.sleep(5000);
		System.out.println("Stop");
	}
}