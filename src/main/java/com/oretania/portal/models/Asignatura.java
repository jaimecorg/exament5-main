package com.oretania.portal.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    private String codigo;

    @Column(name = "descrripcion")
    private String descrripcion;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Alumno> alumnos;

    @Transient
    private boolean tieneAsignatura;

    public Asignatura() {
    }

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrripcion() {
        return descrripcion;
    }

    public void setDescrripcion(String descrripcion) {
        this.descrripcion = descrripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asignatura other = (Asignatura) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public boolean isTieneAsignatura() {
        return tieneAsignatura;
    }

    public void setTieneAsignatura(boolean tieneAsignatura) {
        this.tieneAsignatura = tieneAsignatura;
    }

}