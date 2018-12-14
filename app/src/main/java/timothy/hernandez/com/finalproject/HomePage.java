package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button = findViewById(R.id.button);
    }
    public void dogs(View v){
        Intent i = new Intent(this, Dogs.class);
        startActivity(i);
    }
    public void cats(View v){
        Intent i = new Intent(this, Cats.class);
        startActivity(i);
    }
    public void other(View v){
        Intent i = new Intent(this, Other.class);
        startActivity(i);
    }
    public void donate(View v){
        Intent i = new Intent(this, Donate.class);
        startActivity(i);
    }
    public void about(View v){
        Intent i = new Intent(this, About.class);
        startActivity(i);
    }
}
