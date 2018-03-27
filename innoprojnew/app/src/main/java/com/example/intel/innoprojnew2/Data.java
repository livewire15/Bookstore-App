
package com.example.intel.innoprojnew2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Libraryid")
    @Expose
    private String libraryid;
    @SerializedName("Name")
    @Expose
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLibraryid() {
        return libraryid;
    }

    public void setLibraryid(String libraryid) {
        this.libraryid = libraryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}