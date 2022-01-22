/*
 *Clase tecnico que ereda de operador
 * @author mares cruz tlacaelel horacio
*/
public class Tecnico extends Operador{
    //metodos de herencia 
    public Tecnico(String nombre){
	super(nombre);
    }

    public Tecnico(){
	super();
    }

    /**
     * metodo que devuelve la frase "Estoy trabajando"
     * @return frace
     **/
    public String trabaja(){
	return "Estoy trabajando";
    }
    
    //Metodo toString
    public String toString(){
	return "Tecnico: " + nombre;
    }
    
}
