package engtelecom.poo;

import java.util.HashMap;

public class Phones {

  private static final String PHONE_REGEX = "^[0-9]*$";

  private HashMap<String, String> phones;

  Phones() {
    this.phones = new HashMap<String, String>();
  }

  public boolean add(String label, String email) {
    if (this.phones.containsKey(label) || !email.matches(PHONE_REGEX)) {
      return false;
    }

    this.phones.put(label, email);

    return true;
  }

  public boolean remove(String label) {
    if (!this.phones.containsKey(label)) {
      return false;
    }

    this.phones.remove(label);

    return true;
  }

  public boolean update(String label, String newPhone) {
    if ((!this.phones.containsKey(label)) || (!newPhone.matches(PHONE_REGEX))) {
      return false;
    }

    this.phones.put(label, newPhone);

    return true;
  }

  // TODO implement
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

}
