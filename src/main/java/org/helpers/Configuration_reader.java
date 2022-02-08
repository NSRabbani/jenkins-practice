package org.helpers;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {

	static Properties p;

	public Configuration_reader() throws Throwable {

		File f = new File(
				"D:\\Selenium\\Workspace\\MiniProjectAddactin\\src\\main\\java\\org\\property\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String geturl() {

		String url = p.getProperty("url");

		return url;
	}

	public String getdatein() {

		String dti = p.getProperty("datein");

		return dti;

	}

	public String getdateout() {

		String dto = p.getProperty("dateout");

		return dto;

	}

	public String username() {

		String string = p.getProperty("username");

		return string;

	}

	public String password() {

		String string = p.getProperty("password");

		return string;

	}

	public String fname() {

		String string = p.getProperty("fname");

		return string;
	}

	public String lname() {

		String string = p.getProperty("lname");

		return string;
	}

	public String cardno() {

		String string = p.getProperty("cardno");

		return string;
	}

	public String ccvno() {

		String string = p.getProperty("ccvno");

		return string;
	}

	public String addres() {

		String string = p.getProperty("address");

		return string;

	}

	public String location() {

		
		String s= p.getProperty("location");

		return s;
	}

	public String hotel() {

		return p.getProperty("hotel");

	}

	public String room_type() {

		return p.getProperty("room_type");

	}

	public String numberofrooms() {

		return p.getProperty("num_of_rooms");
	}

	public String adults() {

		return p.getProperty("adults");

	}

	public String child() {

		return p.getProperty("child");

	}

	public String card_type() {

		return p.getProperty("card_type");

	}

	public String exp_month() {

		return p.getProperty("exp_month");

	}

	public String exp_year() {

		return p.getProperty("exp_year");

	}
}
