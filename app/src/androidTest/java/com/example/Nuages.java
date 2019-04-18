
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Nuages {

    @SerializedName("tous")
    @Expose
    private Integer tous;

    public Integer getTous() {
        return tous;
    }

    public void setTous(Integer tous) {
        this.tous = tous;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tous", tous).toString();
    }

}
