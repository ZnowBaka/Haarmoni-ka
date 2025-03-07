package com.example.haarmonika.Utilities;

import com.example.haarmonika.Controller.DatabaseRepository;

import java.time.LocalDateTime;
import java.sql.*;


public class NukeOnStart {

    public static void NukeTime() {
        LocalDateTime now = LocalDateTime.now();
        Timestamp nukeDate = Timestamp.valueOf(now.minusYears(5));
        DatabaseRepository.nukeOnStart(nukeDate);

    }

}