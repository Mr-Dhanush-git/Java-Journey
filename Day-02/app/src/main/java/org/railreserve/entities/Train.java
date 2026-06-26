package org.railreserve.entities;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class Train {
    private String tranId;

    private String TrainNo;

    private List<List<Integer>> seats;

    private Map<String, Time> stationTimes;

    private List<String> stations;

}
