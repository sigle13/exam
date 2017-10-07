package com.exam.examactivity.main.data;

/**
 * Created by android on 2017-09-25.
 */

public class MainMenu {
    public int no;
    public String title;
    public String subject;
    public Class goActivityClass;

    public MainMenu()
    {

    }

    public MainMenu(int no , String title , String subject , Class goActivityClass)
    {
        this.no = no;
        this.title = title;
        this.subject = subject;
        this.goActivityClass = goActivityClass;
    }
}
