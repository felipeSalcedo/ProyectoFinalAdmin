package co.edu.uniquindio.android.electiva.proyectofinaladmin.vo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by JUAN FELIPE on 02/05/2017.
 * clase grupo el cual tendra unos atributos de clase
 */

public class Investigador implements Parcelable {
    private  String nombre;
    private String genero;
    private String nacionalidad;
    private String categoria;
    private String formacion_Academica;
    private String email;
    private String linkCVLAC;

    /**
     * constructor de la apliacion este se usara para agregar o eliminar un grupo en una actividad
     * @param nombre
     * @param genero
     * @param categoria
     * @param formacion_Academica
     */
    public Investigador(String nombre, String genero, String categoria, String formacion_Academica) {
        this.nombre = nombre;
        this.genero = genero;
        this.categoria = categoria;
        this.formacion_Academica = formacion_Academica;
    }

    /**
     * metodo que se usa para escribir sobre esos datos
     * @param in
     */
    protected Investigador(Parcel in) {
        nombre = in.readString();
        genero = in.readString();
        nacionalidad = in.readString();
        categoria = in.readString();
        formacion_Academica = in.readString();
        email = in.readString();
        linkCVLAC = in.readString();
    }

    public static final Creator<Investigador> CREATOR = new Creator<Investigador>() {
        @Override
        public Investigador createFromParcel(Parcel in) {
            return new Investigador(in);
        }

        @Override
        public Investigador[] newArray(int size) {
            return new Investigador[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(genero);
        dest.writeString(nacionalidad);
        dest.writeString(categoria);
        dest.writeString(formacion_Academica);
        dest.writeString(email);
        dest.writeString(linkCVLAC);
    }
}
