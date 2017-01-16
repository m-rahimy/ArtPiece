package ir.mrkgrahimy.tehranart.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Date;

/**
 * Created by Mojtaba on 1/15/2017.
 */
public class Artist extends Person {

    private String artStyle;

    public Artist(@NonNull String fname, @NonNull String lname,
                  @Nullable String birthPlace, @Nullable String nationality,
                  @Nullable String profession, char gender, @Nullable Date birthday, String artStyle) {
        super(fname, lname, birthPlace, nationality, profession, gender, birthday);
        this.artStyle = artStyle;
    }

    private Artist(Parcel in){
        super(in);
        this.artStyle = in.readString();
    }
    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel,i);
        parcel.writeString(artStyle);
    }


    @Override
    public String toString() {

        return super.toString() +
                "artStyle='" + artStyle + '\'' +
                '}';
    }
}
