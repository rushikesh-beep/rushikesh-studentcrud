package com.cts.Model;

public class UserRegisterRequest {
	 private String name;
	    private String username;
	    private String password;
	   

	    
	    public UserRegisterRequest(String name, String username, String password, String city, String department,
				Integer fees) {
			super();
			this.name = name;
			this.username = username;
			this.password = password;
			this.city = city;
			this.department = department;
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "UserRegisterRequest [name=" + name + ", username=" + username + ", password=" + password + ", city="
					+ city + ", department=" + department + ", fees=" + fees + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Integer getFees() {
			return fees;
		}
		public void setFees(Integer fees) {
			this.fees = fees;
		}
		private String city;
	    private String department;
	    private Integer fees;
}
