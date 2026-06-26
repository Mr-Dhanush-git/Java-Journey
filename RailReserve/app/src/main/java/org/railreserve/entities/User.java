package org.railreserve.entities;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class User{
    private String name;

    private String password;

    private String hashPassword;

    private List<Ticket> ticketsBooked;

    private String userId;

}