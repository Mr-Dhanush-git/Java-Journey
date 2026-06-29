package org.railreserve.entities;
import com.fasterxml.jackson.annotations.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotations.JsonNaming;

import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class Train {
    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private List<String> stationTimes;

    private List<String> stations;

    public Train(){
    }

    public Train(String trainId, String trainNo, List<List<Integer>> seats, List<String> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public List<String> getStations(){
        return this.stations;
    }

    public List<List<Integer>> getSeat(){
        return this.seats;
    }

    public void setseats(List<List<Integer>>seats){
        this.seats = seats;
    }

    public List<String> getStationTimes(){
        return this.stationTimes;
    }

    public String getTrainId(){
        return this.trainId;
    }

    public String getTrainNo(){
        return this.trainNo;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", this.trainId,this.trainNo);
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public void setStationTimes(List<String> stationTimes){
        this.stationTimes = stationTimes;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

}


