package cn.edu.bistu.cs.se.start24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonStart=(Button)findViewById(R.id.buttonStart);
        Button buttonEnd=(Button)findViewById(R.id.buttonEnd);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                intent.putExtra("num",10);
                Toast.makeText(MainActivity.this,"启动成功",Toast.LENGTH_LONG).show();
                startService(intent);

            }
        });
        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                stopService(intent);
            }
        });
    }
}
