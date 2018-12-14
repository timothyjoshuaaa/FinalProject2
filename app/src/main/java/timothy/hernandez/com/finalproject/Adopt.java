package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Adopt extends AppCompatActivity {
    String cardnum;
    EditText card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);
    }
    public void back(View v){
        Intent i = new Intent(this, Dogs.class);
        startActivity(i);
    }
    public void adopt(View v){
        cardnum = card.getText().toString();
        validateCreditCardNumber(cardnum);
        Intent i = new Intent(this, HomePage.class);
        startActivity(i);
    }
    private void validateCreditCardNumber(String str) {

        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ints[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            Toast.makeText(this, "Adoption successful and pet is ready for pickup", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Adoption unsuccessful, invalid card number", Toast.LENGTH_LONG).show();

        }
    }
}
