package ir.mrkgrahimy.tehranart.content;


import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Mojtaba on 1/15/2017.
 */
public class ArtPiece implements Parcelable {

    private int type; //
    private String name;
    private Artist artist;
    private String description;
    private Address address;
    private String pictureURI;

    public ArtPiece(int type, @NonNull String name, @NonNull Artist artist, String description,
                    Address address, String pictureURI) {
        this.type = type;
        this.name = name;
        this.artist = artist;
        this.description = description;
        this.address = address;
        this.pictureURI = pictureURI;
    }

    protected ArtPiece(Parcel in) {
        type = in.readInt();
        name = in.readString();
        artist = in.readParcelable(Artist.class.getClassLoader());
        description = in.readString();
        address = in.readParcelable(Address.class.getClassLoader());
        pictureURI = in.readString();
    }

    public static final Creator<ArtPiece> CREATOR = new Creator<ArtPiece>() {
        @Override
        public ArtPiece createFromParcel(Parcel in) {
            return new ArtPiece(in);
        }

        @Override
        public ArtPiece[] newArray(int size) {
            return new ArtPiece[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(type);
        parcel.writeString(name);
        parcel.writeParcelable(artist, i);
        parcel.writeString(description);
        parcel.writeParcelable(address, i);
        parcel.writeString(pictureURI);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPictureURI() {
        return pictureURI;
    }

    public void setPictureURI(String pictureURI) {
        this.pictureURI = pictureURI;
    }

    public static Creator<ArtPiece> getCREATOR() {
        return CREATOR;
    }
}
