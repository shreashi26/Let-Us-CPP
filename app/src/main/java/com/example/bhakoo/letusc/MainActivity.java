package com.example.bhakoo.letusc;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button tutorial, questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tutorial=(Button)findViewById(R.id.tutorial);
        questions=(Button)findViewById(R.id.ques);
    }
    public void  tutorialClick(View v){
        Intent itutorial=new Intent(MainActivity.this,Tutorial.class);
        startActivity(itutorial);
    }
    public void  quesClick(View v){
        Intent iques=new Intent(MainActivity.this,Questions.class);
        startActivity(iques);
    }
    public void  compilerClick(View v){
        Intent icompiler=new Intent(MainActivity.this,compiler.class);
        startActivity(icompiler);
    }
}
