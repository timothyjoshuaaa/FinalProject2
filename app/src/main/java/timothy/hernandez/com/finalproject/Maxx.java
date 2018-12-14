package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Maxx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxx);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    public void adopt(View v){
        Intent i = new Intent(this, Adopt.class);
        startActivity(i);
    }
    public void prev(View v){
        Intent i = new Intent(this, Dogs.class);
        startActivity(i);
    }
}
