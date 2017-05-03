package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;

public class MenuPrincipal extends AppCompatActivity {
    private Button boton;
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

    }



}
