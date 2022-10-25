package engtelecom.poo;

public class Person {

  private String firstName;
  private String lastName;
  private String birthday;
  private Phones phones;
  private Emails emails;

  Person(String firstName, String lastName, String birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.phones = new Phones();
    this.emails = new Emails();
  }

  public boolean addPhone(String label, String phone) {
    return this.phones.add(label, phone);
  }

  public boolean removePhone(String phone) {
    return this.phones.remove(phone);
  }

  public boolean updatePhone(String phone, String newPhone) {
    return this.phones.update(phone, newPhone);
  }

  public boolean addEmail(String label, String email) {
    return this.emails.add(label, email);
  }

  public boolean removeEmail(String email) {
    return this.emails.remove(email);
  }

  public boolean updateEmail(String email, String newEmail) {
    return this.emails.update(email, newEmail);
  }

  // TODO implement
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

}
