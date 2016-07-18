package com.example.admin.customviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 7/12/2016.
 */
public class DateView extends EditText{

    public DateView(Context context) {
        super(context);
        setDate();
    }

    public DateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDate();
    }

    public DateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setDate();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DateView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setDate();
    }

    private void setDate(){
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        this.setText(format.format(new Date()));
    }

}
