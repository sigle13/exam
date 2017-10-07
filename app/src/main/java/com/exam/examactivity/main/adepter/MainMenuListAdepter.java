package com.exam.examactivity.main.adepter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.exam.examactivity.R;
import com.exam.examactivity.main.adepter.viewholder.MainMenuViewHolder;
import com.exam.examactivity.main.data.MainMenu;

import java.util.ArrayList;

/**
 * Created by android on 2017-09-26.
 */

public class MainMenuListAdepter extends BaseAdapter{
    private Context mContext;
    private int mLayout;
    private LayoutInflater mInflater;
    private ArrayList<MainMenu> mItems;

    public MainMenuListAdepter(Context context, int layout, ArrayList<MainMenu> items) {
        this.mContext = context;
        this.mLayout = layout;
        this.mItems = items;
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MainMenuViewHolder viewHolder;

        if(convertView  == null)
        {
            convertView = mInflater.inflate(mLayout, parent, false);

            viewHolder = new MainMenuViewHolder();
            viewHolder.tv_no = (TextView) convertView.findViewById(R.id.tv_no);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_subject);
            viewHolder.tv_subject = (TextView) convertView.findViewById(R.id.tv_title);

            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (MainMenuViewHolder) convertView.getTag();
        }

        viewHolder.tv_no.setText(mItems.get(position).no+".");
        viewHolder.tv_title.setText(mItems.get(position).title);
        viewHolder.tv_subject.setText(mItems.get(position).subject);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,mItems.get(position).goActivityClass);
                mContext.startActivity(intent);
            }
        });

        return convertView;
    }
}
