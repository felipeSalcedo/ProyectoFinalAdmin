package co.edu.uniquindio.android.electiva.proyectofinaladmin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.proyectofinaladmin.R;
import co.edu.uniquindio.android.electiva.proyectofinaladmin.vo.Investigador;

/**
 * esta actividad se encarga de la lista de investigadores ,devolviendo que investigadores van
 * aparecer en los radioButton ,ademas de realizar algunas acciones con los investigadores (aceptar,
 * elimar y postergar)
 * @author JUAN FELIPE SALCEDO -JHON EIDER MARIN
 */
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

    /**
     * Metodo que se encarga realizar las acciones con los investigadores(agregar,eliminar y postergar)
     * @param savedInstanceState
     */
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
        /**
         * Metodo que se encarga realizar las accion de aceptar los investigadores ,se devolvera
         * un mensaje diciendo que ell investigador se ha aceptado
         */
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i1.isChecked() == true) {
                    i1.setText("");
                    Toast.makeText(getApplicationContext(), "se aceptado la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i2.isChecked() == true) {
                    i2.setText("");
                    Toast.makeText(getApplicationContext(), "se aceptado la solicitud del grupo", Toast.LENGTH_SHORT).show();
                } else if (i3.isChecked() == true) {
                    i3.setText("");
                    Toast.makeText(getApplicationContext(), "se aceptado la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i4.isChecked() == true) {
                    i4.setText("");
                    Toast.makeText(getApplicationContext(), "se aceptado la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i5.isChecked() == true) {
                    i5.setText("");
                    Toast.makeText(getApplicationContext(), "se aceptado la solicitud del grupo", Toast.LENGTH_SHORT).show();

                }


            }
        });

        /**
         * Metodo que se encarga realizar las accion de eliminar los investigadores ,se devolvera
         * un mensaje diciendo que ell investigador se ha eliminado
         */
        botonEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i1.isChecked() == true) {
                    i1.setText("");
                    Toast.makeText(getApplicationContext(), "se cancelo la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i2.isChecked() == true) {
                    i2.setText("");
                    Toast.makeText(getApplicationContext(), "se cancelo la solicitud del grupo", Toast.LENGTH_SHORT).show();
                } else if (i3.isChecked() == true) {
                    i3.setText("");
                    Toast.makeText(getApplicationContext(), "se cancelo la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i4.isChecked() == true) {
                    i4.setText("");
                    Toast.makeText(getApplicationContext(), "se cancelo la solicitud del grupo", Toast.LENGTH_SHORT).show();

                } else if (i5.isChecked() == true) {
                    i5.setText("");
                    Toast.makeText(getApplicationContext(), "se cancelo la solicitud del grupo", Toast.LENGTH_SHORT).show();

                }
            }
        });

        /**
         * Metodo que se encarga realizar las accion de postergar los investigadores ,se devolvera
         * un mensaje diciendo que ell investigador se ha postergado
         */
        botonPostergar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "se postergo la solicitud del grupo", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
