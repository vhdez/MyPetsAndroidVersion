package edu.sla.mypetsandroidversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private MyStuff mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mine = new MyStuff();

        final Button button = findViewById(R.id.NextPetButton);
        final TextView myText = findViewById(R.id.NextPetText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("We actually did MORE!!!");
                Displayable nextThingToDisplay = mine.next();
                System.out.println(nextThingToDisplay.hiMessage());
                System.out.println(nextThingToDisplay.description());
                myText.setText(nextThingToDisplay.hiMessage());

            }
        });



    }
}
