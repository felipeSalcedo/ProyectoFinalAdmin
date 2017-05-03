package co.edu.uniquindio.android.electiva.proyectofinaladmin.vo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by JUAN FELIPE on 02/05/2017.
 */

public class Grupo implements Parcelable{
    private String nombre;
    private String siglas;
    private String lider;
    private String categoria;
    private String lineasInvestigacion;
    private String email;
    private String linkCVLAC;

    protected Grupo(Parcel in) {
        nombre = in.readString();
        siglas = in.readString();
        lider = in.readString();
        categoria = in.readString();
        lineasInvestigacion = in.readString();
        email = in.readString();
        linkCVLAC = in.readString();
    }

    public static final Creator<Grupo> CREATOR = new Creator<Grupo>() {
        @Override
        public Grupo createFromParcel(Parcel in) {
            return new Grupo(in);
        }

        @Override
        public Grupo[] newArray(int size) {
            return new Grupo[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLineasInvestigacion() {
        return lineasInvestigacion;
    }

    public void setLineasInvestigacion(String lineasInvestigacion) {
        this.lineasInvestigacion = lineasInvestigacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkCVLAC() {
        return linkCVLAC;
    }

    public void setLinkCVLAC(String linkCVLAC) {
        this.linkCVLAC = linkCVLAC;
    }


    public Grupo(String nombre, String siglas, String lider, String categoria, String lineasInvestigacion, String email, String linkCVLAC) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.lider = lider;
        this.categoria = categoria;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(siglas);
        dest.writeString(lider);
        dest.writeString(categoria);
        dest.writeString(lineasInvestigacion);
        dest.writeString(email);
        dest.writeString(linkCVLAC);
    }
}
