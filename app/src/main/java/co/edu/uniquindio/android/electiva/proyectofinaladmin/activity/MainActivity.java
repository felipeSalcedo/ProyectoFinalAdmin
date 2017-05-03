package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;

public class MainActivity extends AppCompatActivity {
    EditText campo_texto;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = ((EditText) findViewById(R.id.usuario)).getText().toString();
                String password = ((EditText) findViewById(R.id.contraseña)).getText().toString();
                if (usuario.equals("admin") && password.equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(getApplicationContext(),"administrador  incorrecto",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


}

