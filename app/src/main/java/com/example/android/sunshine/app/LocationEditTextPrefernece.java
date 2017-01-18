package com.example.android.sunshine.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * Created by Ink on 2017-01-18.
 */

public class LocationEditTextPrefernece extends EditTextPreference {
    static final private int DEFAULT_MINIMUN_LOCATION_LENGTH = 2;
    private int mMinLength;

    public LocationEditTextPrefernece(Context context, AttributeSet attrs){
        super(context, attrs);
        TypedArray array
                = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.LocationEditTextPreference, 0, 0);
        try {
            mMinLength = array.getInteger(R.styleable.LocationEditTextPreference_minLength, DEFAULT_MINIMUN_LOCATION_LENGTH);
        } finally {
            array.recycle();
            //뭐하는걸깡
        }
    }

}
