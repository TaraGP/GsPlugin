package org.Ivoyant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Schedule {
    private int scheduleId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("target")
    private String target;
    @JsonProperty("active")
    private boolean active = false;
    @JsonProperty("targetType")
    private String targetType;
    @JsonProperty("cron_expression")
    private String cron_expression;
    @JsonProperty("zoneId")
    private String zoneId;
    @JsonProperty("createdTime")
    private Date createdTime;
    @JsonProperty("lastRun")
    private Date lastRun;
    @JsonProperty("nextRun")
    private Date nextRun;
    @JsonProperty("state")
    private ScheduleState state;
}
