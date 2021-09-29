package com.programs;



public class Person {
	private String firstname;
	private String lastname;
	private String address;
	public Person(String firstname, String lastname,String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address=address;
	}
	public String getfirstName() {
		return firstname;
	}
	public String getlastName() {
		return lastname;
	}
	public String getaddress() {
		return address;
	}
	@Override
    public boolean equals(final Object obj) {
      if (obj == null) {
         return false;
      }
      final Person p = (Person) obj;
      if (this == p) {
         return true;
      } else {
         return (this.firstname.equals(p.firstname)&& this.lastname == p.lastname);
      }
    }
	@Override
    public int hashCode() {
      int hashno = 7;
      hashno = 13 * hashno + (firstname == null ? 0 : firstname.hashCode());
      return hashno;
    }
}
	

