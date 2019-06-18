package com.lucasbezerrateixeira.draganddrop;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button dragbutton;
    LinearLayout dropbutton;
    TextView tv,sucess;
    int total,fail = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dragbutton = (Button) findViewById(R.id.one);
        dropbutton = (LinearLayout) findViewById(R.id.bottomlinear);
        tv = (TextView) findViewById(R.id.Total);
        sucess = (TextView) findViewById(R.id.Sucess);
        dropbutton.setOnDragListener(new View.OnDragListener() {

            @Override
            public boolean onDrag(View v , DragEvent event) {
                final int action = event.getAction();
                switch (action){

                    case DragEvent.ACTION_DRAG_STARTED:
                        break;

                    case DragEvent.ACTION_DRAG_EXITED:
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;

                    case DragEvent.ACTION_DROP: {
                        total = total + 1;
                        int value = total - fail;
                        sucess.setText("Drop Feito: " + value);
                        tv.setText("Total de Drops: " + total );
                        return (true);
                    }
                    default:
                        break;
                }
                return true;
            }
        });
        dragbutton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1){
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadow = new  View.DragShadowBuilder(dragbutton);
                v.startDrag(data, shadow, null, 0);
                return false;
            }
        });
    }
}
