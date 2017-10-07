package com.exam.examactivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.exam.examactivity.R;
import com.exam.examactivity.activity.result.MenuActivity;


/**
 * Created by android on 2017-09-27.
 */

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void onBtnClick1(View v) {
        Toast.makeText(this, "btn id : " + v.getId(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void onBtnClick2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void onBtnClick3(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("tel:010-8591-9866"));
        startActivity(intent);
    }
}
