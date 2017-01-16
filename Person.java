package ir.mrkgrahimy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Date;

/**
 * Created by Mojtaba on 1/15/2017.
 */
public abstract class Person implements Parcelable {
    String firstName, lastName, birthPlace, nationality, profession;
    char gender;
    Date birthday;

    protected Person(@NonNull String firstName, @NonNull String lastName,
                  @Nullable String birthPlace,
                  @Nullable String nationality,
                  @Nullable String profession,
                  char gender,
                  @Nullable Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
        this.nationality = nationality;
        this.profession = profession;
        this.gender = gender;
        this.birthday = birthday;
    }

    protected Person(Parcel in){
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.birthPlace = in.readString();
        this.nationality = in.readString();
        this.profession = in.readString();
        this.gender = in.readString().charAt(0);
        this.birthday = new Date(Long.valueOf(in.readString()));
    }
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(firstName);
        out.writeString(lastName);
        out.writeString(birthPlace);
        out.writeString(nationality);
        out.writeString(profession);
        out.writeString(String.valueOf(gender));
        Log.d("Person birthday", String.valueOf(birthday.getTime()));
        out.writeString(birthday.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", nationality='" + nationality + '\'' +
                ", profession='" + profession + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
