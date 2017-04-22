package com.example.cw.right;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar mToolbar=(Toolbar)findViewById(R.id.toolbar);
        mToolbar.setTitle("Quotes");
        mToolbar.setSubtitle("Inspirational Quotes");
        mToolbar.setNavigationIcon(R.drawable.ic_action_name);
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP)
        {
            mToolbar.setElevation(10f);
        }
        Button button1=(Button)findViewById(R.id.Button01);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Main4Activity.this,Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        Button button2=(Button)findViewById(R.id.Button02);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Main4Activity.this,Main3Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title=(String)item.getTitle();
                Toast.makeText(Main4Activity.this,title + "Selected",Toast.LENGTH_SHORT).show();
                switch (item.getItemId())
                {
                    case R.id.camera:
                        break;
                    case R.id.mail:
                        break;
                }
                return true;
            }
        });
    }
}
