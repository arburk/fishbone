package org.arburk.fishbone.controller;

import org.arburk.fishbone.model.Fish;
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
