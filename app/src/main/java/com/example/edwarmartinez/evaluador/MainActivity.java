package com.example.edwarmartinez.evaluador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.txt_mat);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.tx_qui);
        tv1 = (TextView)findViewById(R.id.tv_estado);

    }

    public void estatus(View view)
    {
        String matString = et1.getText().toString();
        String fisString = et2.getText().toString();
        String quiString = et3.getText().toString();

        int mat_Int = Integer.parseInt(matString);
        int Fis_Int = Integer.parseInt(fisString);
        int Qui_Int = Integer.parseInt(quiString);


        int prom = (mat_Int+ Fis_Int +  Qui_Int)/3;
        if(prom>=6)
        {
            tv1.setText("Ok -> " +  prom);
        }
        else if (prom <=5)
        {
            tv1.setText("X -> " +  prom);
        }


    }



}
