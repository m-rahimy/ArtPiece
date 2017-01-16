package ir.mrkgrahimy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Mojtaba on 1/15/2017.
 */
public class Address implements Parcelable {

    private int number;
    private String alleyName;
    private String streetName;
    private String districtName;
    private String placeName;
    private String city;

    public Address(@Nullable int number,
                   @Nullable String alleyName,
                   @NonNull String streetName,
                   String districtName,
                   @NonNull String placeName,
                   @NonNull String city) {
        this.number = number;
        this.alleyName = alleyName;
        this.streetName = streetName;
        this.districtName = districtName;
        this.placeName = placeName;
        this.city = city;
    }

    protected Address(Parcel in) {
        number = in.readInt();
        alleyName = in.readString();
        streetName = in.readString();
        districtName = in.readString();
        placeName = in.readString();
        city = in.readString();
    }

    public static final Creator<Address> CREATOR = new Creator<Address>() {
        @Override
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        @Override
        public Address[] newArray(int size) {
            return new Address[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(number);
        parcel.writeString(alleyName);
        parcel.writeString(streetName);
        parcel.writeString(districtName);
        parcel.writeString(placeName);
        parcel.writeString(city);
    }

    @Override
    public String toString() {
        return "Address : {" +
                "number=" + number +
                ", alleyName='" + alleyName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", placeName='" + placeName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String toJSON() {
        return "\"Address\": {" +
                "\"number\":" + number +
                "\", alleyName:\"" + alleyName + '\"' +
                "\", streetName:\"" + streetName + '\"' +
                "\", districtName:\"" + districtName + '\"' +
                "\", placeName=\"" + placeName + '\"' +
                "\", city=\"" + city + '\"' +
                "\"}";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAlleyName() {
        return alleyName;
    }

    public void setAlleyName(String alleyName) {
        this.alleyName = alleyName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
