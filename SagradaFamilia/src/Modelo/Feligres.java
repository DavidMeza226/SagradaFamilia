package Modelo;

public class Feligres {

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estrato;
    private String estado;
    private Integer diesmo;
    private static Integer totalizar = 0;
    private int cont = 0;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getDiesmo() {
        return diesmo;
    }

    public void setDiesmo(Integer diesmo) {
        this.diesmo = diesmo;
    }

    public void calcularDiesmo() {
        if (estrato.equals("1")) {
            diesmo = 250000;
        }
        if (estrato.equals("2")) {
            diesmo = 500000;
        }
        if (estrato.equals("3")) {
            diesmo = 1000000;
        }
    }

    public String pagarDiezmo() {

        StringBuffer sb = new StringBuffer("------PAGOS DE DIEZMO IGLESIA SAGRADA FAMILIA------\n");
        if (estado.equals("Deudor")) {
            cont++;
            totalizar += diesmo;
            sb.append("Feligres: " + nombre + " Pago: " + diesmo + " N° de pago:" + cont);
            this.setEstado("Cumplido");
        } else {
            sb.append("Esta al dia con la iglesia");
        }
        return sb.toString();

    }

    public String totalizar(String cedula) {
        StringBuffer sb = new StringBuffer("________-Total De Diezmo______\n");

        sb.append(" Total: " + totalizar + "\n");
        sb.append("...........................");

        return sb.toString();

    }

    public void actualizar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        if (nombre != null) {
            this.setNombre(nombre);
        }
        if (direccion != null) {
            this.setDireccion(direccion);
        }
        if (telefono != null) {
            this.setTelefono(telefono);
        }
        if (estrato != null) {
            this.setEstrato(estrato);
            calcularDiesmo();
        }
        if (estado != null) {
            this.setEstado(estado);
        }
    }

    @Override
    public String toString() {
        return "Feligrese{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", estrato=" + estrato + ", estado=" + estado + ", diesmo=" + diesmo + '}';
    }

}
