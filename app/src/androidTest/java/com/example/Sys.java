
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sys {

    @SerializedName("message")
    @Expose
    private Double message;
    @SerializedName("pays")
    @Expose
    private String pays;
    @SerializedName("lever du soleil")
    @Expose
    private Integer leverDuSoleil;
    @SerializedName("coucher du soleil")
    @Expose
    private Integer coucherDuSoleil;

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Integer getLeverDuSoleil() {
        return leverDuSoleil;
    }

    public void setLeverDuSoleil(Integer leverDuSoleil) {
        this.leverDuSoleil = leverDuSoleil;
    }

    public Integer getCoucherDuSoleil() {
        return coucherDuSoleil;
    }

    public void setCoucherDuSoleil(Integer coucherDuSoleil) {
        this.coucherDuSoleil = coucherDuSoleil;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("message", message).append("pays", pays).append("leverDuSoleil", leverDuSoleil).append("coucherDuSoleil", coucherDuSoleil).toString();
    }

}
