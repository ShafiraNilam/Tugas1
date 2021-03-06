package id.sch.smktelkom_mlg.tugas01.xirpl3032.tugas01ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNama, etUmur;
    Button buttonOk;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    TextView tvHasil;
    Spinner spinnerAsal;
    RadioButton rb1, rb2;

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
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        spinnerAsal = (Spinner) findViewById(R.id.spinnerAsal);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        tvHasil = (TextView) findViewById(R.id.textView);

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doClick();
            }
        });


    }

    private void doClick() {
        if (isValid()) {
            String Nama = etNama.getText().toString();
            String hasil = "Terima Kasih " + etNama.getText().toString() + " Berumur " + etUmur.getText().toString() + "\n";

            int startlen = hasil.length();
            if (cb1.isChecked()) hasil += cb1.getText() + "\n";
            if (cb2.isChecked()) hasil += cb2.getText() + "\n";
            if (cb3.isChecked()) hasil += cb3.getText() + "\n";
            if (cb4.isChecked()) hasil += cb4.getText() + "\n";
            if (cb5.isChecked()) hasil += cb5.getText() + "\n";
            if (rb1.isChecked()) hasil += rb1.getText() + "\n";
            if (rb1.isChecked()) hasil += rb1.getText() + "\n";
            tvHasil.setText("" + hasil);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String tahun = etUmur.getText().toString();
        String hasil = null;
        String status = null;

        if (nama.isEmpty()) {
            etNama.setError("Nama harus diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }
        if (tahun.isEmpty()) {
            etUmur.setError("Umur anda harus diisi");
            valid = false;
        } else {
            etUmur.setError(null);
        }
        if (status == null) {
            tvHasil.setText("Belum memilih jenis kelamin");
        }
        if (cb1.isChecked()) {
            hasil = cb1.getText().toString();
        } else if (cb2.isChecked()) {
            hasil = cb2.getText().toString();
        } else if (cb3.isChecked()) {
            hasil = cb3.getText().toString();
        } else if (cb4.isChecked()) {
            hasil = cb4.getText().toString();
        } else if (cb5.isChecked()) {
            hasil = cb5.getText().toString();
        }
        if (hasil == null) {
            tvHasil.setText("Belum memilih Ekstra");
        }
        return valid;
    }
}
