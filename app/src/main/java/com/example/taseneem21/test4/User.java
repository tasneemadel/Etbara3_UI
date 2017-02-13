package com.example.taseneem21.test4;

/**
 * Created by dino on 23/11/14.
 */
public class User {

    String NAME = "name";
 String Adress = "";
    String GroupId = "GroupID";

    String ADDRESS = "address";

     String BLOOD_TYPE = "Blood";

 String phone = "phone";

 String ADDITIONAL = "additional";

   String HealthCondition = "HealthCondition";

   String Email = "email";

     String USER_DONATION = "UserDonation";

    String birthdate = "birthDate";



    public String getUsername() {
        return NAME;
    }

    public void setUsername(String hospitalname) {
        this.NAME= hospitalname;
    }

    public String getEmail() {
        return Email;
    }

    public void setUserEmail(String Email) {
        this.Email = Email;
    }

    public String getUserAdress() {
        return Adress;
    }

    public void setUserAdress(String Password) {
        this.Adress = Password;
    }

    public String getUserBirthDate() {
        return birthdate;
    }

    public void setUserBlood(String Blood) {
        this.Adress = Blood;
    }



    public String getUserBloood() {
        return BLOOD_TYPE;
    }

    public void setUserBirthday(String Birthday) {
        this.birthdate = Birthday;
    }

    public String getUserHealthCondition() {
        return HealthCondition;
    }

    public void setUserHealthCondition(String HealthCondition) {
        this.HealthCondition = HealthCondition;
    }

    public String getUserPhonen() {
        return phone;
    }

    public void setUserPhone(String phone) {
        this.phone =phone;
    }



    public String getUserGroupId() {
        return GroupId;
    }

    public void setUserGroupID(String phone) {
        this.GroupId =phone;
    }
}
