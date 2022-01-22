/*
 *clase Empleado
 * @author horacio mares cruz
*/
public class Empleado{
    //constructores
    protected String nombre;

    public Empleado(){
	this.nombre = "horacio";
    }
   
    public Empleado(String nombre){
	this.nombre = nombre;
    }
    //setters y getters
    public String getNombre(){
	return this.nombre;
    }

    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    
    /*
     *Metodo toString
     */
    public String toString(){
	return "Empleado: " + nombre;
    }
    
    //Metodo equals
     
    @Override
    public boolean equals(Object empleado){
	Empleado hor = (Empleado) empleado;
	return this.nombre.equals(hor.getNombre());
    }    
}
