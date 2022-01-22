/*
 *clase que tambien hereda de empleado
 * @author mares cruz tlacaelel horacio
*/
public class Directivo extends Empleado{
    //metodos constructores 
    public Directivo(String nombre){
	super(nombre);
    }
    //metodo para agregar la herencia
    public Directivo(){
	super();
    }

    //metodo to string
    public String toString(){
	return "Directivo: " + nombre;
    }

}
