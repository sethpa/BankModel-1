package bank;

public class CafeBranch extends Bank{
	
	private String menu;

	public CafeBranch() {
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String toString() {
		return "Company Name: " + super.toString() + "\nMenu: " + menu; 
	}

}
