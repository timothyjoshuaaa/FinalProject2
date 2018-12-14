package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        b = (Button) findViewById(R.id.call);

    }
    public void call(View v){
        Intent i =new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:09062864256"));
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
}
