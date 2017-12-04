/**
 * @DATEDec 4, 2017
 * @YEAR2017
 * @PROJECTNAMEThan_Van_Duong_Servlet
 *
 */
package model;

/**
 * @author User
 *
 */
public class student {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String gender;
  private String description;
  private String traffic;


  public student() {

  }


  public student(String firstName, String lastName, String phoneNumber, String gender, String description,
      String traffic) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.description = description;
    this.traffic = traffic;
  }


  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public String getTraffic() {
    return traffic;
  }


  public void setTraffic(String traffic) {
    this.traffic = traffic;
  }

}
