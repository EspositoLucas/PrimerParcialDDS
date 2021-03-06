package primer.parcial.dds.Business.suscripciones;

import primer.parcial.dds.Security.sistema.Usuario;

public class SinSuscripcion extends Suscripcion{
    public int modo = 1;

    @Override
    public Suscripcion cambiarModo(Suscripcion unModo, Usuario unUsuario) {
        if(unModo.getInt() == 3) {
            if (unUsuario.restarCredito(5)){
                return new Premium();
            }else{System.out.println("No se puede cambiar la suscripcion, no hay credito"); }
        } else if (unModo.getInt() == 2) {
            if (unUsuario.restarCredito(1)){
                return new Normal();
            }else{System.out.println("No se puede cambiar la suscripcion, no hay credito"); }
        } else {
            System.out.println("Ya estabas en modo Sin Suscripcion... Te recomendamos un oculista");
            System.out.println("Dr. Lucas Giorgio                                  Tel. 4855-4821");
        }
        return unModo;
    }

    @Override
    public int getInt(){return modo;}

}
