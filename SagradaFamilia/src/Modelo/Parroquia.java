package Modelo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

public class Parroquia {

    private ArrayList<Feligres> feligreses;

    public Parroquia() {
        feligreses = new ArrayList<>();
    }

    public void agregarFeligrese(Feligres p) {
        feligreses.add(p);
    }

    public Feligres buscarFeligrese(String cedula) {
        Feligres f = new Feligres();
        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                f = feligreses.get(i);
            }
        }
        return f;
    }

    public String printFeligreses() {
        StringBuffer sb = new StringBuffer("Feligreses: \n");
        for (int i = 0; i < feligreses.size(); i++) {
            sb.append(feligreses.get(i).toString() + "\n");
        }
        return sb.toString();
    }

    public void eliminarFeligres(String cedula) {

        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                feligreses.remove(i);

            }
        }

    }

}
