package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhonesTest {

  // TODO implement
  @Test
  public void testAdd() {
    Phones phones = new Phones();

    assertTrue(phones.add("phone", "5504812341234"), "Should add phone");
    assertTrue(phones.add("other", "55048012341234"), "Should add phone");

    assertFalse(phones.add("phone", "5504812341235"), "Should not add phone with duplicate label");
    assertFalse(phones.add("another", "+550481234123"), "Should not add phone, string should contain only numbers");
  }

  // TODO implement
  @Test
  public void testRemove() {
    Phones phones = new Phones();

    phones.add("phone", "5504812341234");
    phones.add("other", "55048012341234");

    assertTrue(phones.remove("phone"), "Should remove phone");
    assertTrue(phones.remove("other"), "Should remove phone");

    assertFalse(phones.remove("phone"), "Should not remove phone");
  }

  // TODO implement
  @Test
  public void testUpdate() {
    Phones phones = new Phones();

    phones.add("phone", "5504812341234");

    assertTrue(phones.update("phone", "55048012341234"), "Should update phone");

    assertFalse(phones.update("404", "55048012341234"), "Should not update phone");
    assertFalse(phones.update("phone", "+55048012341234"),
        "Should not update phone, string should contain only numbers");
  }

}
