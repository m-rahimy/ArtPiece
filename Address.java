package ir.mrkgrahimy.tehranart.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;

/**
 * Created by Mojtaba on 1/15/2017.
 */
public class Address implements Parcelable {

    private int pelak;
    private String valleyName;
    private String streetName;
    private String mahalleName;
    private String placeName;
    private String city;

    public Address(@Nullable int pelak,
                   @Nullable String valleyName,
                   @NonNull String streetName,
                   String mahalleName,
                   @NonNull String placeName,
                   @NonNull String city) {
        this.pelak = pelak;
        this.valleyName = valleyName;
        this.streetName = streetName;
        this.mahalleName = mahalleName;
        this.placeName = placeName;
        this.city = city;
    }

    protected Address(Parcel in) {
        pelak = in.readInt();
        valleyName = in.readString();
        streetName = in.readString();
        mahalleName = in.readString();
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
        parcel.writeInt(pelak);
        parcel.writeString(valleyName);
        parcel.writeString(streetName);
        parcel.writeString(mahalleName);
        parcel.writeString(placeName);
        parcel.writeString(city);
    }

    @Override
    public String toString() {
        return "Address : {" +
                "pelak=" + pelak +
                ", valleyName='" + valleyName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", mahalleName='" + mahalleName + '\'' +
                ", placeName='" + placeName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String toJSON() {
        return "\"Address\": {" +
                "\"pelak\":" + pelak +
                "\", valleyName:\"" + valleyName + '\"' +
                "\", streetName:\"" + streetName + '\"' +
                "\", mahalleName:\"" + mahalleName + '\"' +
                "\", placeName=\"" + placeName + '\"' +
                "\", city=\"" + city + '\"' +
                "\"}";
    }

    public int getPelak() {
        return pelak;
    }

    public void setPelak(int pelak) {
        this.pelak = pelak;
    }

    public String getValleyName() {
        return valleyName;
    }

    public void setValleyName(String valleyName) {
        this.valleyName = valleyName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getMahalleName() {
        return mahalleName;
    }

    public void setMahalleName(String mahalleName) {
        this.mahalleName = mahalleName;
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
