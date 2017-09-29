package com.example.leonardo.aula02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdtGas;
    EditText mEdtAlcool;
    TextView mTxtResultado;

    View.OnClickListener tratadorDeEvento = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            double gasolina = Double.parseDouble(mEdtGas.getText().toString());
            double alcool = Double.parseDouble(mEdtAlcool.getText().toString());

            String resultado = getString(R.string.resultado);

            if ((gasolina * 0.7) > alcool) {
                resultado += getString(R.string.alcool);
            } else {
                resultado += getString(R.string.gasolina);
            }
            mTxtResultado.setText(resultado);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtGas = (EditText) findViewById(R.id.edtGas);
        mEdtAlcool = (EditText) findViewById(R.id.edtAlcool);
        mTxtResultado = (TextView) findViewById(R.id.txtResultado);


        findViewById(R.id.btnCalcular).setOnClickListener(tratadorDeEvento);


    }
}
