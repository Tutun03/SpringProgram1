package in.sp.beans;
//pojo class
public class student {
private String name;
private String rollno;
private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void display()
{
	System.out.println(name);
	System.out.println(rollno);
	System.out.println(email);
	
}


}
