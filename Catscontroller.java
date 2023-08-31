package com.cats.Cats;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Catscontroller {

@GetMapping("/cats")
    public List<Catname> getCatNames(){    return List.of(new Catname("siam","Charles"),new Catname("persia","chacha"));
}
}
