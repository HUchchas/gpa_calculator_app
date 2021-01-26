package com.example.hasan.gpacalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double totalCreditHours ;
    public double totalGradePoint ;


    DecimalFormat precision = new DecimalFormat("#.000");

    public void onButton1Click(View v){

        EditText cre1 = (EditText) findViewById(R.id.Credit1);
        EditText cre2 = (EditText) findViewById(R.id.Credit2);
        EditText cre3 = (EditText) findViewById(R.id.Credit3);
        EditText cre4 = (EditText) findViewById(R.id.Credit4);
        EditText cre5 = (EditText) findViewById(R.id.Credit5);
        EditText cre6 = (EditText) findViewById(R.id.Credit6);
        EditText cre7 = (EditText) findViewById(R.id.Credit7);

        EditText gra1 = (EditText) findViewById(R.id.Grade1);
        EditText gra2 = (EditText) findViewById(R.id.Grade2);
        EditText gra3 = (EditText) findViewById(R.id.Grade3);
        EditText gra4 = (EditText) findViewById(R.id.Grade4);
        EditText gra5 = (EditText) findViewById(R.id.Grade5);
        EditText gra6 = (EditText) findViewById(R.id.Grade6);
        EditText gra7 = (EditText) findViewById(R.id.Grade7);

        TextView t1 = (TextView) findViewById(R.id.Result);

        int c1 = cre1.getText().toString().equals("") ? 0 : Integer.parseInt(cre1.getText().toString());
        int c2 = cre2.getText().toString().equals("") ? 0 : Integer.parseInt(cre2.getText().toString());
        int c3 = cre3.getText().toString().equals("") ? 0 : Integer.parseInt(cre3.getText().toString());
        int c4 = cre4.getText().toString().equals("") ? 0 : Integer.parseInt(cre4.getText().toString());
        int c5 = cre5.getText().toString().equals("") ? 0 : Integer.parseInt(cre5.getText().toString());
        int c6 = cre6.getText().toString().equals("") ? 0 : Integer.parseInt(cre6.getText().toString());
        int c7 = cre7.getText().toString().equals("") ? 0 : Integer.parseInt(cre7.getText().toString());

        double g1 = gra1.getText().toString().equals("") ? 0 : Double.parseDouble(gra1.getText().toString());
        double g2 = gra2.getText().toString().equals("") ? 0 : Double.parseDouble(gra2.getText().toString());
        double g3 = gra3.getText().toString().equals("") ? 0 : Double.parseDouble(gra3.getText().toString());
        double g4 = gra4.getText().toString().equals("") ? 0 : Double.parseDouble(gra4.getText().toString());
        double g5 = gra5.getText().toString().equals("") ? 0 : Double.parseDouble(gra5.getText().toString());
        double g6 = gra6.getText().toString().equals("") ? 0 : Double.parseDouble(gra6.getText().toString());
        double g7 = gra7.getText().toString().equals("") ? 0 : Double.parseDouble(gra7.getText().toString());

        double gradePoint1 = c1 * g1 ;
        double gradePoint2 = c2 * g2 ;
        double gradePoint3 = c3 * g3 ;
        double gradePoint4 = c4 * g4 ;
        double gradePoint5 = c5 * g5 ;
        double gradePoint6 = c6 * g6 ;
        double gradePoint7 = c7 * g7 ;

        totalGradePoint = gradePoint1 + gradePoint2 + gradePoint3 + gradePoint4 + gradePoint5 + gradePoint6 + gradePoint7 ;
        totalCreditHours = c1 + c2 + c3 + c4 + c5 + c6 + c7 ;

        double result = totalGradePoint/totalCreditHours ;
        String gpa = precision.format(result) ;
        t1.setText(gpa);
    }

    public void onButton2Click(View v){

        EditText cre8 = (EditText) findViewById(R.id.CummCredit);
        EditText gra8 = (EditText) findViewById(R.id.CummGrade);
        TextView t2 = (TextView) findViewById(R.id.FinalResult);

        int c8 = cre8.getText().toString().equals("") ? 0 : Integer.parseInt(cre8.getText().toString());
        double g8 = gra8.getText().toString().equals("") ? 0 : Double.parseDouble(gra8.getText().toString());

        double combinedCreditHours = totalCreditHours + c8 ;
        double combinedGradePoint = totalGradePoint + (c8 * g8) ;

        double fresult = combinedGradePoint/combinedCreditHours ;
        String cgpa = precision.format(fresult) ;
        t2.setText(cgpa) ;
    }
}
