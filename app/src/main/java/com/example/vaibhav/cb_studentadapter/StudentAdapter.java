package com.example.vaibhav.cb_studentadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vaibhav on 13-06-2017.
 */

public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> studentsArrayList;
    Context context;

    public StudentAdapter(ArrayList<Student> studentsArrayList, Context context) {
        this.studentsArrayList = studentsArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return studentsArrayList.size();
    }

    @Override
    public Student getItem(int i) {
        return studentsArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater li=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView=li.inflate(R.layout.tupple_layout,null);
        }
//        View itemView =li.inflate(R.layout.tupple_layout,null);
        Student thisStudent=getItem(position);
        ((TextView)convertView.findViewById(R.id.tvName)).setText(thisStudent.getName().toString());
        ((TextView)convertView.findViewById(R.id.tvCourse)).setText(thisStudent.getCourse().toString());

        return convertView;
    }
}
