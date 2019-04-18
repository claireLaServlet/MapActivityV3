
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Vent {

    @SerializedName("vitesse")
    @Expose
    private Double vitesse;
    @SerializedName("deg")
    @Expose
    private Integer deg;

    public Double getVitesse() {
        return vitesse;
    }

    public void setVitesse(Double vitesse) {
        this.vitesse = vitesse;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vitesse", vitesse).append("deg", deg).toString();
    }

}
