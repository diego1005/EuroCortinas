package logica;

import igu.cargaDatos;
import igu.cargaInsumos;
import persistencia.ControladoraPersistencia;

public class app {

    public static void main(String[] args) {
        
//        cargaInsumos carga_ins = new cargaInsumos();
//        carga_ins.setVisible(true);
        
//        cargaDatos carga_dat = new cargaDatos();
//        carga_dat.setVisible(true);
        
    Insumo ins = new Insumo("123", "Black Out", "Telas", "Printemps", "2.50 - Nat", "metros", 10, 10, 10, 10, 10);
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    control.crearInsumo(ins);


    }
    
}
