package org.arburk.fishbone.api;

import org.arburk.fishbone.domain.Fish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController()
public class FishController {

    @GetMapping("/fish")
    public List<Fish> getFish(){
        return Collections.singletonList(Fish.builder().build());
    }
}
