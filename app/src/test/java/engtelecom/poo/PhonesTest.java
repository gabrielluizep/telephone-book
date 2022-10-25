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
    assertFalse(phones.add("another", "550481234123"), "Should not add phone with less than 12 digits");
  }

  // TODO implement
  @Test
  public void testRemove() {

  }

  // TODO implement
  @Test
  public void testUpdate() {

  }

}
