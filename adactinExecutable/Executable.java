package adactinExecutable;

import java.io.IOException;

import adactinBase.Base;
import adactinpojo.Pojo;

public class Executable extends Base {
	public static void main(String[] args) throws IOException {
		launch();
		url("http://adactinhotelapp.com");
		max();
		waiting();
		Pojo p = new Pojo();

		filling(p.getTxtuser(),
				data("E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\POM\\Excel\\Book1.xlsx", "login",
						1, 0));
		filling(p.getTxtpass(),
				data("E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\POM\\Excel\\Book1.xlsx", "login",
						1, 1));
		pressing(p.getLog());

		// location
		dropindex(p.getLoc(), 1);
		// hotels
		dropvalue(p.getHotel(), "Hotel Creek");
		// room type
		dropindex(p.getRoom(), 1);
		// no
		dropindex(p.getNo(), 1);
		// in date
		filling(p.getIndate(), "21/02/2021");
		filling(p.getOutdate(), "25/02/2021");
		pressing(p.getSearch());
		pressing(p.getRadio());
		pressing(p.getCont());
		filling(p.getFirstname(), "deva");
		filling(p.getLastname(), "santy");
		filling(p.getLocation(), "No.5,6/13 selaiyur");
		filling(p.getCreditcard(), "1234567899876543");

		dropindex(p.getCredittype(), 1);
		dropindex(p.getExpmonth(), 2);
		dropindex(p.getExpyr(), 11);
		filling(p.getCvv(), "1232");
		pressing(p.getBooking());
		get(p.getOrder(), "value");
	}

}
