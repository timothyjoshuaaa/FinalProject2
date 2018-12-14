package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    public void coco(View v){
        Intent i = new Intent(this, Coco.class);
        startActivity(i);
    }
    public void quill(View v){
        Intent i = new Intent(this, Quill.class);
        startActivity(i);
    }
    public void oreo(View v){
        Intent i = new Intent(this, Oreo.class);
        startActivity(i);
    }
    public void spike(View v){
        Intent i = new Intent(this, Spike.class);
        startActivity(i);
    }
}
