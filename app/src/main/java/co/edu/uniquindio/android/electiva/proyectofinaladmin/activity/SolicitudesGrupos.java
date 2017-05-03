package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;
import co.edu.uniquindio.android.electiva.proyectofinaladmin.vo.Investigador;

public class SolicitudesGrupos extends AppCompatActivity {
    private ArrayList<Investigador> grupos;
    private RadioButton i1;
    private RadioButton i2;
    private RadioButton i3;
    private RadioButton i4;
    private RadioButton i5;
    private Button botonAgregar;
    private Button botonEliminar;
    private Button botonPostergar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudes_grupos);

        grupos = new ArrayList();
        grupos.add(new Investigador("Grupo en Redes y Desarrollo", "GRID", "Julian Esteban Gutierrez", "A1"));
        grupos.add(new Investigador("Grupo software para obrass lineales", "SOL", "Cesar Yepez", "C"));
        grupos.add(new Investigador("GrupoInteligencia artificial", "IA", "Pablo perez", "D"));
        grupos.add(new Investigador("Grupo en ensamblador de nuevas tecnologias", "GEN", "Gerardo Domingo", "A2"));



        ((RadioButton) findViewById(R.id.radioButton1)).setText("Grupo en Redes y Desarrollo, GRID, Julian Esteban Gutierrez, A1");
        ((RadioButton) findViewById(R.id.radioButton2)).setText("Grupo software para obrass lineales, SOL, Cesar Yepez, C");
        ((RadioButton) findViewById(R.id.radioButton3)).setText("GrupoInteligencia artificial, IA, Pablo perez, D");
        ((RadioButton) findViewById(R.id.radioButton4)).setText("Grupo en ensamblador de nuevas tecnologias, GEN, Gerardo Domingo, A2");

        i1 = (RadioButton) findViewById(R.id.radioButton1);
        i2 = (RadioButton) findViewById(R.id.radioButton2);
        i3 = (RadioButton) findViewById(R.id.radioButton3);
        i4 = (RadioButton) findViewById(R.id.radioButton4);
        i5 = (RadioButton) findViewById(R.id.radioButton5);

        botonAgregar = (Button) findViewById(R.id.buttonAceptar);
        botonEliminar = (Button) findViewById(R.id.buttonEliminar);
        botonPostergar = (Button) findViewById(R.id.buttonPostergar);
    }
}
