package quiz;

public class EBook extends Book{
	
	private double fileSize;
	
	public EBook() {
		this("Unknown", "Unknown", 0.0);
	}

	public EBook(String title, String author, double fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public void printInfo() {
		System.out.println(getTitle() + " - " + getAuthor() + ", 파일 크기: " + fileSize + "MB");
	}

}
