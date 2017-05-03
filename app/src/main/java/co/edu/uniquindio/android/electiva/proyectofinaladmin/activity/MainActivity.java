package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;

/**
 * clase principal que ejecuta la aplicacion
 * este se encarga de lanzar el primer layout de la aplicacion
 * @author JUAN FELIPE SALLCEDO - JHON EIDER MARIN
 */
public class MainActivity extends AppCompatActivity {
    //variables que usaran en la actividad
    EditText campo_texto;
    Button button;

    /**
     * Este metodo se encarga de mostrar la actividad en la aplicacion y
     * se inicializa el evento del boton
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.boton);
        /**
         * evento del boton ,en este metodo tambien se realiza el login que debe hacer el administrador
         * si el administrador no tiene el usuario y la contraseña correcta no podra ingresar a a la siguiente
         * ventana
         */
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

