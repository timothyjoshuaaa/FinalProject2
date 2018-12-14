package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);
        Button b = findViewById(R.id.back);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    public void maxx(View v){
        Intent i = new Intent(this, Maxx.class);
        startActivity(i);
    }
    public void rumpole(View v){
        Intent i = new Intent(this, Rumpole.class);
        startActivity(i);
    }
    public void lucky(View v){
        Intent i = new Intent(this, Lucky.class);
        startActivity(i);
    }
    public void buttons(View v){
        Intent i = new Intent(this, Buttons.class);
        startActivity(i);
    }

}
