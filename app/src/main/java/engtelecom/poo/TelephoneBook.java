package engtelecom.poo;

import java.util.ArrayList;

public class TelephoneBook {

  private ArrayList<Person> contacts;

  TelephoneBook() {
    this.contacts = new ArrayList<Person>();
  }

  public boolean addContact(Person person) {
    return false;
  }

  public boolean removeContact(String firstName, String lastName) {
    return false;
  }

  public boolean addPhone(String firstName, String lastName, String label, String phone) {
    return false;
  }

  public boolean removePhone(String firstName, String lastName, String phone) {
    return false;
  }

  public boolean updatePhone(String firstName, String lastName, String phone, String newPhone) {
    return false;
  }

  public boolean addEmail(String firstName, String lastName, String label, String email) {
    return false;
  }

  public boolean removeEmail(String firstName, String lastName, String email) {
    return false;
  }

  public boolean updateEmail(String firstName, String lastName, String email, String newEmail) {
    return false;
  }

  // TODO implement
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

}
