package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclear,bclearE,b_add,b_sub,b_div,b_dec,b_equal,b_multipl;

    TextView numdisplay;
    TextView eqdisplay;

    private double val1;
    private double val2;

    boolean lastnum;
    boolean adder,subtractor,multiplier,divider;
    public int array[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.no0);
        b1 = (Button) findViewById(R.id.no1);
        b2 = (Button) findViewById(R.id.no2);
        b3 = (Button) findViewById(R.id.no3);
        b4 = (Button) findViewById(R.id.no4);
        b5 = (Button) findViewById(R.id.no5);
        b6 = (Button) findViewById(R.id.no6);
        b7 = (Button) findViewById(R.id.no7);
        b8 = (Button) findViewById(R.id.no8);
        b9 = (Button) findViewById(R.id.no9);
        bclear = (Button) findViewById(R.id.clear);
        bclearE = (Button) findViewById(R.id.clearE);
        b_add = (Button) findViewById(R.id.adder);
        b_sub = (Button) findViewById(R.id.sub);
        b_div = (Button) findViewById(R.id.div);
        b_dec = (Button) findViewById(R.id.dot);
        b_equal = (Button) findViewById(R.id.eq);
        b_multipl = (Button) findViewById(R.id.multip);
        numdisplay = (TextView) findViewById(R.id.display);
        eqdisplay = (TextView) findViewById(R.id.aftdisplay);




        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"0");
                lastnum = true;
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"1");
                lastnum = true;
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"2");
                lastnum = true;
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"3");
                lastnum = true;
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"4");
                lastnum = true;
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"5");
                lastnum = true;
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"6");
                lastnum = true;
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"7");
                lastnum = true;
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"8");
                lastnum = true;
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"9");
                lastnum = true;
            }
        });

        b_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+".");
                lastnum = true;
            }
        });


        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"+");
                lastnum = false;
            }
        });


        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"-");
                lastnum = false;
            }
        });

        b_multipl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"*");
                lastnum = false;
            }
        });

        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numdisplay.setText(numdisplay.getText()+"/");
                lastnum = false;
            }
        });


        bclearE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = numdisplay.getText().toString();
                if(str.length() == 0)
                    return;
                str = str.substring(0, str.length() - 1);
                numdisplay.setText(str);
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = numdisplay.getText().toString();
                if(str.length() == 0)
                    return;
                str = null;
                numdisplay.setText(str);
                eqdisplay.setText(str);

            }
        });


         b_equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String txt = numdisplay.getText().toString();
                    eqdisplay.setText(txt);

                    if(lastnum) {

                    // Create an Expression (A class from exp4j library)
                        Expression expression = new ExpressionBuilder(txt).build();
                            // Calculate the result and display
                        double result = expression.evaluate();
                        numdisplay.setText(Double.toString(result));
                    }
                }
            });
    }
}
