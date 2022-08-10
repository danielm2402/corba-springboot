package servicios;

import utilidades.UtilidadesConsola;
import utilidades.UtilidadesRegistroC;

import sop_corba.ControladorNotificacionesInt;

public class ClienteDeObjetos
{

	private static ControladorNotificacionesInt objRemoto;
        
	public static void main(String[] args) {
            
            String[] vectorDatosLocalizarNS = new String[4];
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vectorDatosLocalizarNS[1] = UtilidadesConsola.leerCadena();
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vectorDatosLocalizarNS[3] = UtilidadesConsola.leerCadena();
           
            objRemoto = UtilidadesRegistroC.obtenerObjRemoto(vectorDatosLocalizarNS,"idObjetoRemoto");
           
            
            
	}
	
	
	
}

