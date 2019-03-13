package exercicecours1.exeinformatique.com.exercicecours1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Compare_Number compareNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compareNumber = new Compare_Number();
    }

    public void compare(View button) {
        EditText editTextFirstNumber = findViewById(R.id.txt_number1);
        int firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
        EditText editTextSecondNumber = findViewById(R.id.txt_number2);
        int secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());

        editTextSecondNumber.getBackground().setColorFilter(getColor(R.color.txtBackgroundDefault), PorterDuff.Mode.SRC_ATOP);
        editTextSecondNumber.setBackgroundResource(android.R.drawable.edit_text);

        Compare_Number.compareState compareState = compareNumber.evaluate(firstNumber, secondNumber);
        if (compareState == Compare_Number.compareState.BIGGER) {
            editTextFirstNumber.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
            Toast.makeText(
                    this,
                    "Le premier nombre est plus grand",
                    Toast.LENGTH_LONG
            ).show();
        } else if(compareState == Compare_Number.compareState.SMALLER) {
            editTextSecondNumber.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
            Toast.makeText(
                    this,
                    "Le deuxième nombre est plus grand",
                    Toast.LENGTH_LONG
            ).show();
        } else {
            Toast.makeText(
                    this,
                    "Les nombres sont identiques",
                    Toast.LENGTH_LONG
            ).show();
        }
    }
}
