import java.util.Date;

public class Employee {
  int emp_id;
  String emp_name;
  String gender;
  Date birthdate;
  String address;
  String city;

  public Employee(int emp_id, String emp_name, String gender, Date birthdate,
      String address, String city) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.gender = gender;
    this.birthdate = birthdate;
    this.address = address;
    this.city = city;
  }

  public int getEmp_id() {
    return emp_id;
  }

  public void setEmp_id(int emp_id) {
    this.emp_id = emp_id;
  }

  public String getEmp_name() {
    return emp_name;
  }

  public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
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

  @Override
  public String toString() {
    return "Employee{" +
        "emp_id=" + emp_id +
        ", emp_name='" + emp_name + '\'' +
        ", gender='" + gender + '\'' +
        ", birthdate='" + birthdate + '\'' +
        ", address='" + address + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
