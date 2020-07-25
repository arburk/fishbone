package org.arburk.fishbone.infrastructure.service;

import org.arburk.fishbone.domain.Fish;

import java.util.Collections;
import java.util.List;

public class FishRepository {

  public static List<Fish> getAllFish() {
    return Collections.singletonList(Fish.builder().build());
  }
}
