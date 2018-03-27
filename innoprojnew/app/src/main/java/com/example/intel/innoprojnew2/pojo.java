
package com.example.intel.innoprojnew2;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;


public class pojo {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}