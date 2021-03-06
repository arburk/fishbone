package org.arburk.fishbone.api;

import org.arburk.fishbone.domain.Fish;
import org.arburk.fishbone.infrastructure.service.FishRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("fish")
public class FishController {

  private final FishRepository fishRepo;

  public FishController(FishRepository fishRepo) {
    this.fishRepo = fishRepo;
  }

  @GetMapping("/list")
  public List<Fish> getFishes() {
    return fishRepo.getAllFish();
  }

}
