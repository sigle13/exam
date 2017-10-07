package com.exam.examactivity.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by android on 2017-09-26.
 */

public class Exam01Activity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv_text = new TextView(this);
        tv_text.setText("텍스트");

        LinearLayout.LayoutParams lparam = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.FILL_PARENT);
        lparam.width = 200;


        setContentView(tv_text, lparam);


    }
}
