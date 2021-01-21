package adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class Pojo extends Base {
	//1.create constructor
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	//User name
	@FindBy(id="username")
	private WebElement txtuser;
	
	//Password
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	//Click
	@FindBy(id="login")
	private WebElement log;
	
	//dropdown-location
	@FindBy(xpath="//select[@name='location']")
	private WebElement loc;
	
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getSearch() {
		return search;
	}
	//dropdown-hotels
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	//dropdown-room type
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;
	
	//dropdown-room no
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement no;
	//in date
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement indate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement outdate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement cont;
	
	//firstname
	@FindBy(xpath="//input[@name=\"first_name\"]")
	private WebElement firstname;
	
	//Lastname
	
	@FindBy(xpath="//input[@name=\"last_name\"]")
	private WebElement lastname;
	
	//location
	@FindBy(xpath="//textarea[@name=\"address\"]	")
	private WebElement location;
	
	//credit
	@FindBy(xpath="//input[@name=\"cc_num\"]")
	private WebElement creditcard	;
	
	//credittype
	@FindBy(xpath="//select[@name=\"cc_type\"]")
	private WebElement credittype;
	//Exp.dte
	@FindBy(xpath="//select[@name=\"cc_exp_month\"]")
	private WebElement Expmonth;
	
	@FindBy(xpath="//select[@name=\"cc_exp_year\"]")
	private WebElement Expyr;
	
	@FindBy(xpath="//input[@name=\"cc_cvv\"]")
	private WebElement cvv;
	//booknow
	
	@FindBy(xpath="//input[@name=\"book_now\"]")
	private WebElement booking;
	//order
	@FindBy(xpath="//input[@name=\"order_no\"]	")
	private WebElement order;

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getExpyr() {
		return Expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getRadio() {
		return radio;
		
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLog() {
		return log;
	}

}
