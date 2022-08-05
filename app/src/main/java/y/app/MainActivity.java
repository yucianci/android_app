package y.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etanol, gasolina;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etanol = findViewById(R.id.main_etanol);
        gasolina = findViewById(R.id.main_gasolina);
        calculate = findViewById(R.id.main_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }

    private void calculate() {
        double valueEtanol = Double.parseDouble(etanol.getText().toString());
        double valueGasolina = Double.parseDouble(gasolina.getText().toString());

        double result = valueEtanol / valueGasolina;

        if(result <= 0.7) {
            printResult("Abastecer com etanol!");
        } else {
            printResult("Abastecer com gasolina!");
        }
    }

    private void printResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}