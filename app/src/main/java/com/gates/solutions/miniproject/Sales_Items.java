package com.gates.solutions.miniproject;

public class Sales_Items
{
   private String Type,username,Location,Poster_id,Pid,Price,Time,Description,Telephone,First_Image_Url,Second_Image_Url,Third_Image_Url,Fourth_Image_Url,Fifth_Image_Url,profile_Image_Url,Posted_by;

    public Sales_Items()
    {

    }


    public Sales_Items(String Post_by,String type,String Poster_id,String username,String location, String pid, String price, String time, String description, String telephone, String first_Image_Url, String second_Image_Url,
                       String third_Image_Url, String fourth_Image_Url, String fifth_Image_Url,String profile_Image_Url) {

        this.Posted_by = Post_by;
        this.Type = type;
        this.Poster_id = Poster_id;
        this.username = username;
        this.Location = location;
        this.Pid = pid;
        this.Price = price;
        this.Time = time;
        this.Description = description;
        this.Telephone = telephone;
        this.First_Image_Url = first_Image_Url;
        this.Second_Image_Url = second_Image_Url;
        this.Third_Image_Url = third_Image_Url;
        this.Fourth_Image_Url = fourth_Image_Url;
        this.Fifth_Image_Url = fifth_Image_Url;
        this.profile_Image_Url = profile_Image_Url;
    }

    public String getProfile_Image_Url() {
        return profile_Image_Url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfile_Image_Url(String profile_Image_Url) {
        this.profile_Image_Url = profile_Image_Url;
    }

    public String getPoster_id() {
        return Poster_id;
    }

    public void setPoster_id(String poster_id) {
        Poster_id = poster_id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        Pid = pid;
    }


    public String getLocation() {
        return Location;
    }


    public void setLocation(String location) {
        Location = location;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getSecond_Image_Url() {
        return Second_Image_Url;
    }

    public void setSecond_Image_Url(String second_Image_Url) {
        Second_Image_Url = second_Image_Url;
    }

    public String getThird_Image_Url() {
        return Third_Image_Url;
    }

    public void setThird_Image_Url(String third_Image_Url) {
        Third_Image_Url = third_Image_Url;
    }

    public String getFourth_Image_Url() {
        return Fourth_Image_Url;
    }

    public void setFourth_Image_Url(String fourth_Image_Url) {
        Fourth_Image_Url = fourth_Image_Url;
    }

    public String getFifth_Image_Url() {
        return Fifth_Image_Url;
    }

    public void setFifth_Image_Url(String fifth_Image_Url) {
        Fifth_Image_Url = fifth_Image_Url;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public String getFirst_Image_Url() {
        return First_Image_Url;
    }

    public void setFirst_Image_Url(String first_Image_Url) {
        First_Image_Url = first_Image_Url;
    }

    public String getPosted_by() {
        return Posted_by;
    }

    public void setPosted_by(String posted_by) {
        Posted_by = posted_by;
    }
}
