package OOPS_Abstract;

public abstract class Page {
	
	public abstract void tiitle();
	public abstract void url();
	public abstract void header();
	
	public void loadingPage() {
		System.out.println("This ia my page loading");
	}
	
	public final void logo() {
		System.out.println("This is my Page -- logo");
	}
	
	public static void pageFooter() {
		System.out.println("This is my Page -- footer");
	}
	
}
