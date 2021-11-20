package co.acuasoftsystemapp.model;

import javax.persistence.*;

public class Operadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cedula;

    private String nombre1;

    private String nombre2;

    private String apellido1;

    private String apellido2;

    private String telefono;

    private String direccion;

    private String email;

    private String password;

    private Boolean estado;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return cedula
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * @param cedula
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * @return nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return nombre2
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * @param nombre2
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * @return apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * @param estado
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}