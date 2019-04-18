
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MTO {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("main")
    @Expose
    private String main;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("ic\u00f4ne ")
    @Expose
    private String icNe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcNe() {
        return icNe;
    }

    public void setIcNe(String icNe) {
        this.icNe = icNe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("main", main).append("description", description).append("icNe", icNe).toString();
    }

}
