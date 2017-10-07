package com.exam.examactivity.activity.data;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by android on 2017-10-02.
 */

public class SimpleData implements Parcelable {

    public int number;
    public String message;

    public SimpleData(int number, String message) {
        this.number = number;
        this.message = message;
    }

    protected SimpleData(Parcel in) {
        number = in.readInt();
        message = in.readString();
    }


    public static final Creator<SimpleData> CREATOR = new Creator<SimpleData>() {
        @Override
        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        @Override
        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };
/*
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        @Override
        public Object createFromParcel(Parcel source) {
            return new SimpleData(source);
        }

        @Override
        public Object[] newArray(int size) {
             return new SimpleData[size];
        }
    };
*/
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
