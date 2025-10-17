package org.unimag.dto;

import org.unimag.modelo.Autor;
import org.unimag.modelo.Editorial;

public class LibroDto {

    private Integer idLibro;
    private String nombreLibro;
    private Double precioLibro;
    private Short anioLibro;
    private Editorial idEditorial;
    private Autor idAutor;

    public LibroDto() {
    }

    public LibroDto(Integer idLibro, String nombreLibro, Double precioLibro, Short anioLibro, Editorial idEditorial, Autor idAutor) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.precioLibro = precioLibro;
        this.anioLibro = anioLibro;
        this.idEditorial = idEditorial;
        this.idAutor = idAutor;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(Double precioLibro) {
        this.precioLibro = precioLibro;
    }

    public Short getAnioLibro() {
        return anioLibro;
    }

    public void setAnioLibro(Short anioLibro) {
        this.anioLibro = anioLibro;
    }

    public Editorial getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Editorial idEditorial) {
        this.idEditorial = idEditorial;
    }

    public Autor getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Autor idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return nombreLibro;
    }
}