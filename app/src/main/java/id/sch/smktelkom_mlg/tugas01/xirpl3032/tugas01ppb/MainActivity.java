package id.sch.smktelkom_mlg.tugas01.xirpl3032.tugas01ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNama, etUmur;
    Button buttonOk;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    TextView tvHasil;
    Spinner spinnerAsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etUmur = (EditText) findViewById(R.id.editTextUmur);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb5 = (CheckBox) findViewById(R.id.cb5);
        spinnerAsal = (Spinner) findViewById(R.id.spinnerAsal);
        buttonOk = (Button) findViewById(R.id.buttonOk);

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });


    }

    private void doClick() {
        String hasil = "Terima Kasih " + etNama.getText().toString() + " Telah memilih \n";

        int startlen = hasil.length();
        if (cb1.isChecked()) hasil += cb1.getText() + "\n";
        if (cb2.isChecked()) hasil += cb2.getText() + "\n";
        if (cb3.isChecked()) hasil += cb3.getText() + "\n";
        if (cb4.isChecked()) hasil += cb4.getText() + "\n";
        if (cb5.isChecked()) hasil += cb5.getText() + "\n";
        if (hasil.length() == startlen) hasil += "Tidak ada pilihan";

        tvHasil.setText(hasil);
    }
}
