package com.exam.examactivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.exam.examactivity.R;


public class MyLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_life_cycle);

        Button btn_close = (Button) findViewById(R.id.btn_close);

        Log.e("onCreate", "onCreate 호출됨");

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    /* 가장중요 */
    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);

        if (pref != null) {
            String name = pref.getString("name", "");
            Toast.makeText(this, "복구된 이름 : " + name, Toast.LENGTH_SHORT).show();
        }

    }

    /* 가장중요 */
    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", "소녀시대");
        editor.commit();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
