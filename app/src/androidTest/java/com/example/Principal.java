
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Principal {

    @SerializedName(" temp ")
    @Expose
    private Double temp;
    @SerializedName(" pression ")
    @Expose
    private Double pression;
    @SerializedName(" humidit\u00e9 ")
    @Expose
    private Integer humidit;
    @SerializedName(" temp_min ")
    @Expose
    private Double tempMin;
    @SerializedName(" temp_max ")
    @Expose
    private Double tempMax;
    @SerializedName("sea_level")
    @Expose
    private Double seaLevel;
    @SerializedName("grnd_level")
    @Expose
    private Double grndLevel;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getPression() {
        return pression;
    }

    public void setPression(Double pression) {
        this.pression = pression;
    }

    public Integer getHumidit() {
        return humidit;
    }

    public void setHumidit(Integer humidit) {
        this.humidit = humidit;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Double getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(Double grndLevel) {
        this.grndLevel = grndLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("temp", temp).append("pression", pression).append("humidit", humidit).append("tempMin", tempMin).append("tempMax", tempMax).append("seaLevel", seaLevel).append("grndLevel", grndLevel).toString();
    }

}
