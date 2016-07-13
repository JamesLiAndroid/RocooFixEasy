package com.smallsoho.racootext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dodola.rocoofix.RocooFix;

public class MainActivity extends AppCompatActivity {

    private Button fixButton;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fixButton = (Button) findViewById(R.id.btn_fix);
        checkButton = (Button) findViewById(R.id.btn_check);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, HelloHack.showHello(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
