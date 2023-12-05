package com.helloworld.great;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MusicianController {
    private Map<String, String> Musician;

    @GetMapping( "/musician")
    public List<Musician> getMusician() {
       return List.of(
               new Musician("Dave Mustaine","Vocals/Guitar"),
               new Musician("Kiko Loureiro","Guitar"),
               new Musician("James LoMenzo","Bass"),
               new Musician("Dirk Verbeuren","Drum")
               );

    }
}