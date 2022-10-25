package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailsTest {

  @Test
  public void testAdd() {
    Emails emails = new Emails();

    assertTrue(emails.add("email", "email@domain.com"), "Should add email");
    assertTrue(emails.add("success", "success@domain.com"), "Should add email");

    assertFalse(emails.add("other", "other@domain"), "Should not add email that does not match patter s@s.s");
    assertFalse(emails.add("other", "@domain.com"), "Should not add email that does not match patter s@s.s");
    assertFalse(emails.add("other", "email@.com"), "Should not add email that does not match patter s@s.s");
    assertFalse(emails.add("other", "email.com"), "Should not add email that does not match patter s@s.s");
    assertFalse(emails.add("other", ""), "Should not add email that does not match patter s@s.s");

    assertFalse(emails.add("email", "other@domain.com"), "Should not add email with same label");

  }

  @Test
  public void testRemove() {
    Emails emails = new Emails();

    emails.add("email", "email@domain.com");

    assertTrue(emails.remove("email"), "Should remove email");

    assertFalse(emails.remove("email"), "Should not remove email");
    assertFalse(emails.remove(""), "Should not remove email");
    assertFalse(emails.remove("404"), "Should not remove email");

  }

  @Test
  public void testUpdate() {
    Emails emails = new Emails();

    emails.add("email", "email@domain.com");

    assertTrue(emails.update("email", "email@new.com"), "Should update email");

    assertFalse(emails.update("404", "email@new.com"), "Should not update email");

    assertFalse(emails.update("email", "other@domain"), "Should not update email that does not match patter s@s.s");
    assertFalse(emails.update("email", "@domain.com"), "Should not update email that does not match patter s@s.s");
    assertFalse(emails.update("email", "email@.com"), "Should not update email that does not match patter s@s.s");
    assertFalse(emails.update("email", "email.com"), "Should not update email that does not match patter s@s.s");
    assertFalse(emails.update("email", ""), "Should not update email that does not match patter s@s.s");
  }

}
