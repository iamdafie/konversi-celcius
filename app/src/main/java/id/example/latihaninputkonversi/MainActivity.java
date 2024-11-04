package id.example.latihaninputkonversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtInput;
    Button tombolHitung;
    TextView txtReamur;
    float hasilnya;
    int angkaInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtInput = findViewById(R.id.edtInput);
        tombolHitung = findViewById(R.id.tbHitung);
        txtReamur = findViewById(R.id.txtHasil);
        tombolHitung.setOnClickListener(new ); View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                angkaInput = Integer.parseInt(edtInput.getText().toString());
                hasilnya = angkaInput *4/5;
                txtReamur.setText(""+hasilnya+"Derajat");
            }
        });
    }
}