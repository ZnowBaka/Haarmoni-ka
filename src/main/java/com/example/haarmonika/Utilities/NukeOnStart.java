package com.example.haarmonika.Utilities;

import com.example.haarmonika.Controller.DatabaseRepository;
import java.sql.*;
import java.time.LocalDateTime;

public class NukeOnStart {


    public static void NukeTime() {
        LocalDateTime now = LocalDateTime.now();
        Timestamp nukeDate = Timestamp.valueOf(now.minusYears(5));
        DatabaseRepository.nukeOnStart(nukeDate);

    }

}
