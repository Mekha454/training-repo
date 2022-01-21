package project0.models;

import java.util.Objects;

public class User{
	
	private String userName;
	private String password;
	private String fullName;
	private int birthMonth;
	private int birthDay;
	private String address;
	private String city;
	private String state;
	private String phone;
	private int balance;
	
	public User() {
		super();
	}

	public User(String userName, String password, String fullName, int birthMonth, int birthDay, String address,
			String city, String state, String phone, int balance) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		 this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		 this.fullName = fullName;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		 this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		 this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		 this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		 this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		 this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		 this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, balance, birthDay, birthMonth, city, fullName, password, phone, state, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && balance == other.balance && birthDay == other.birthDay
				&& birthMonth == other.birthMonth && Objects.equals(city, other.city)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(state, other.state)
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", fullName=" + fullName + ", birthMonth="
				+ birthMonth + ", birthDay=" + birthDay + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", phone=" + phone + ", balance=" + balance + "]";
	}

	
}



		
		

	
		

	

	
	
	
	
	
	
	
	
	
	
	
	
	


	

