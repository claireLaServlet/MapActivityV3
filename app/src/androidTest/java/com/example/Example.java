
package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Example {

    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("m\u00e9t\u00e9o")
    @Expose
    private List<MTO> mTO = null;
    @SerializedName(" base ")
    @Expose
    private String base;
    @SerializedName(" principal ")
    @Expose
    private Principal principal;
    @SerializedName("vent")
    @Expose
    private Vent vent;
    @SerializedName("nuages")
    @Expose
    private Nuages nuages;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("cod")
    @Expose
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<MTO> getMTO() {
        return mTO;
    }

    public void setMTO(List<MTO> mTO) {
        this.mTO = mTO;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Vent getVent() {
        return vent;
    }

    public void setVent(Vent vent) {
        this.vent = vent;
    }

    public Nuages getNuages() {
        return nuages;
    }

    public void setNuages(Nuages nuages) {
        this.nuages = nuages;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("coord", coord).append("mTO", mTO).append("base", base).append("principal", principal).append("vent", vent).append("nuages", nuages).append("dt", dt).append("sys", sys).append("id", id).append("nom", nom).append("cod", cod).toString();
    }

}
