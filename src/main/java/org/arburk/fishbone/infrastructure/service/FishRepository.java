package org.arburk.fishbone.infrastructure.service;

import org.arburk.fishbone.domain.Fish;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FishRepository {

  @Value("${fishbone.lang.default}")
  private Fish.Language langDefault;

  public List<Fish> getAllFish() {
    System.out.println(langDefault);
    return Collections.singletonList(Fish.builder().build());
  }

  /**
   * Test for codeQL to verify if the UseBraces.ql identifies the missing braces
   */
  public void enforceCodeQL_Warning() {
    if(1==1)
        f();
        g(); // Alert
  }
  public void f() {
  }

  public void g() {
  }
}
