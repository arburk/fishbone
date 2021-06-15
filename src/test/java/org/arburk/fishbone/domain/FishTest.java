package org.arburk.fishbone.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {


  @Test
  void testLanguageEnum() {
    assertEquals(4, Fish.Language.values().length);
  }
}
