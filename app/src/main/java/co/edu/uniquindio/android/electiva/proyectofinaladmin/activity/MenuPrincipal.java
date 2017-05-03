package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;

/**
 * @author JUAN FELIPE SALCEDO -JHON EIDER MARIN
 * En esta clase lanza a la actividad del menu principal ,ademas de dirigir a
 * otras actividades
 */
public class MenuPrincipal extends AppCompatActivity {
    private Button boton;
    private Button boton2;


    /**
     * metodo que lanza la actividad ,ademas realiza otras redirecciones
     * ya sea a la actividad de solicitudes de investigadores o de grupos
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, SolicitudesInvestigadores.class);
                startActivity(intent);
            }
        });
        boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, SolicitudesGrupos.class);
                startActivity(intent);
            }
        });

    }



}
