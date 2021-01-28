package net.ddns.crbkproject.domain.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SoilMoistureEvent extends Event implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("dev")
    private String device;

    @JsonProperty("sm")
    private int sm;

    private SoilMoistureEvent() {
    }

    @JsonCreator
    public SoilMoistureEvent(
            @JsonProperty("dev") String device,
            @JsonProperty("sm") int sm) {
        this.device = device;
        this.sm = sm;
    }

    public String getDevice() {
        return device;
    }

    public int getSm() {
        return sm;
    }
}
