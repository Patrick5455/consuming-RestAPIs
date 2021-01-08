package model;



import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;
import java.util.Map;

@JsonDeserialize
@Data
public class AccuracySummary {
    private double value;
    private AccuracyValues latestValues;
    private List<Map<String, AccuracyValues>> history;

}


@JsonDeserialize
@Data
class AccuracyValues{
    private String datetime;
    private double precision;
    private double recall;
    private double accuracy;
    private double truePositive;
}


