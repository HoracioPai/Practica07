/*
 *clase que hereda de empleado
 * @author mares cruz tlacaelel horacio
*/
public class Operador extends Empleado{
    //metodos de herencia
    public Operador(String nombre){
	super(nombre);
    }

    public Operador(){
	super();
    }
    //metodo tostring
    public String toString(){
	return "Operador: " + nombre;
    }

}
