package bank;
/**
 * Model a bank corporation like 5/3rd
 * let's do a little bit of design marker noise marker noise marker noise marker noise marker noise marker noise you're gonna do this for homework so pay attention here this is part of your homework
 * then we'll say there's a brick and mortar branch then we'll say there's an online presence this is not a good design then we'll say we're out of green marker noise we'll say there is a cafe branch
 * like the tv what tv bank has it you can have a scone and open an account 
 * @author barrbm
 *
 */
public class Bank {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String toString()	{
		return(companyName);
	}
}
