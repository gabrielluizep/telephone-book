package engtelecom.poo;

import java.util.HashMap;

public class Emails {

  private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

  private HashMap<String, String> emails;

  Emails() {
    this.emails = new HashMap<String, String>();
  }

  public boolean add(String label, String email) {
    if (this.emails.containsKey(label) || !email.matches(EMAIL_REGEX)) {
      return false;
    }

    this.emails.put(label, email);

    return true;
  }

  public boolean remove(String label) {
    if (!this.emails.containsKey(label)) {
      return false;
    }

    this.emails.remove(label);

    return true;
  }

  public boolean update(String label, String newEmail) {
    if ((!this.emails.containsKey(label)) || (!newEmail.matches(EMAIL_REGEX))) {
      return false;
    }

    this.emails.put(label, newEmail);

    return true;
  }

  // TODO implement
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

}
