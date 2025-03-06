package com.example.haarmonika.Utilities;

import com.example.haarmonika.Controller.DatabaseRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NukeOnStart {


    public static void NukeTime() {

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime nukeDate = null;
        nukeDate = dateTime.minusYears(5);

        DatabaseRepository.nukeOnStart(nukeDate);

    }

}
