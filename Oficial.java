/*
 *clase que ereda de operador
 * @author mares cruz tlacaelel horacio
*/
public class Oficial extends Operador{
    //metodos constructores que heredan
    public Oficial(String nombre){
	super(nombre);
    }

    public Oficial(){
	super();
    }

    /*
     * Metodo que devuelve la frase "Estoy trabajando"
     * @return Estoy trabajando
     */    
    public String trabaja(){
	return "Estoy trabajando";
    }

    //Metodo toString
     
    public String toString(){
	return "Oficial: " + nombre;
    }

}
