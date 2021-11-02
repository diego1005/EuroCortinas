package persistencia;

import logica.Insumo;

public class ControladoraPersistencia {
    
    InsumoJpaController insJPA = new InsumoJpaController();
    
    public void crearInsumo(Insumo ins) {
        try {
            insJPA.create(ins);
        } catch (Exception ex) {
            System.out.println("Error al crear: " + ex.getMessage());
        }
    }
    
    
}
