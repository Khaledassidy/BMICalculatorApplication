package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title,myBMI,pounds;
    Button Btn;
    EditText myweight,myheight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=findViewById(R.id.Title);
        myBMI=findViewById(R.id.BMI);
        pounds=findViewById(R.id.mypounds);
        Btn=findViewById(R.id.mybutton);
        myweight=findViewById(R.id.myweight);
        myheight=findViewById(R.id.myheight);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String weight= myweight.getText().toString();
              String height=myheight.getText().toString();
              double weight1=Double.parseDouble(weight);
              Float height1=Float.parseFloat(height);
              Float weight2=Float.parseFloat(weight);
              double pounds1=Calculatepounds(weight1);
              pounds.setText(""+pounds1);
              double yourbmi=CalculateBmi(weight2,height1);
              myBMI.setText(""+yourbmi);


            }
        });
    }

    public double Calculatepounds(double Weight){
        return Weight*2.204;
    }

    public double CalculateBmi(float Weight,float height){
        return Weight/Math.pow((height*0.01),2);
    }


}