package com.exam.examactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.exam.examactivity.activity.Exam01Activity;
import com.exam.examactivity.activity.HelloActivity;
import com.exam.examactivity.activity.LayoutInflayTion;
import com.exam.examactivity.activity.MyIntentActivity;
import com.exam.examactivity.activity.MyParcelble;
import com.exam.examactivity.main.adepter.MainMenuListAdepter;
import com.exam.examactivity.main.data.MainMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_list;
    MainMenuListAdepter adepter;
    ArrayList<MainMenu> mainMenus;
    int pnum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setMainMenu();
    }

    void init() {
        lv_list = (ListView) findViewById(R.id.lv_list);
    }

    void setMainMenu() {
        mainMenus = new ArrayList<>();
        mainMenus.add(new MainMenu(pnum++, "LayoutParams", "LayoutParams 사용방법", Exam01Activity.class));
        mainMenus.add(new MainMenu(pnum++, "helloWord", "첫프로그램 버튼클릭 암시적 인텐트 전화걸기 인터넷 열기", HelloActivity.class));
        mainMenus.add(new MainMenu(pnum++, "xml 파일 메모리화", "레이아웃 인플레이션", LayoutInflayTion.class));
        mainMenus.add(new MainMenu(pnum++, "intent 화면전환 ", "화면전환 값넘겨주기 값 리턴 받기", MyIntentActivity.class));
        mainMenus.add(new MainMenu(pnum++, "intent 객체전달 ", "객체 전달", MyParcelble.class));
        mainMenus.add(new MainMenu(pnum++, "intent 객체전달 ", "객체 전달", MyParcelble.class));
        mainMenus.add(new MainMenu(pnum++, "intent 객체전달 ", "객체 전달", MyParcelble.class));
        mainMenus.add(new MainMenu(pnum++, "intent 객체전달 ", "객체 전달", MyParcelble.class));
        adepter = new MainMenuListAdepter(this, R.layout.layout_main_list_item, mainMenus);
        lv_list.setAdapter(adepter);
    }
}
