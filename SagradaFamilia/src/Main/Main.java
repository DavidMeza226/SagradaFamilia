package Main;

import Modelo.Feligres;
import Modelo.Parroquia;
import vista.SistemaParroquia;
import control.Controlador;

public class Main {

    public static void main(String[] args) {
        SistemaParroquia v = new SistemaParroquia();
        Feligres f = new Feligres();
        Parroquia p = new Parroquia();
        Controlador c = new Controlador(v, f, p);
        v.setVisible(true);
    }
}
