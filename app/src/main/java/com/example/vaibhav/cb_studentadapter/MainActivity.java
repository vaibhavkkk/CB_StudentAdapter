package com.example.vaibhav.cb_studentadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static  ArrayList<Student> studentArrayList=null;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentArrayList=generateStudents();
        listView=(ListView)findViewById(R.id.lv_students);
        listView.setAdapter(new StudentAdapter(studentArrayList,this));

    }

    public static ArrayList<Student> generateStudents(){
        ArrayList<Student> newStudents=new ArrayList<>();

        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Crux"));
        newStudents.add(new Student("D","Pandora"));
        newStudents.add(new Student("E","Crux"));
        newStudents.add(new Student("F","Algo++"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Crux"));
        newStudents.add(new Student("D","Pandora"));
        newStudents.add(new Student("E","Crux"));
        newStudents.add(new Student("F","Algo++"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        newStudents.add(new Student("A","Pandora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Crux"));
        newStudents.add(new Student("D","Pandora"));
        newStudents.add(new Student("E","Crux"));
        newStudents.add(new Student("F","Algo++"));
        newStudents.add(new Student("G","Elixir"));
        newStudents.add(new Student("H","Pandora"));
        return newStudents;
    }
}
