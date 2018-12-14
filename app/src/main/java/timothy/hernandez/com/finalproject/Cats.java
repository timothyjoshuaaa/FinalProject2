package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    public void toby(View v){
        Intent i = new Intent(this, Toby.class);
        startActivity(i);
    }
    public void harley(View v){
        Intent i = new Intent(this, Harley.class);
        startActivity(i);
    }
    public void garfield(View v){
        Intent i = new Intent(this, Garfield.class);
        startActivity(i);
    }
    public void tigger(View v){
        Intent i = new Intent(this, Tigger.class);
        startActivity(i);
    }
}
