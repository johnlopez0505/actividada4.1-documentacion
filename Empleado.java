package ies;
/**
 * Esta clase la utilizo para poder documentar  con javadoc.
 * @author john lopez
 * @version 0.0
 * @since 0.0.1
 * @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com – Didáctica en programación </a>
 */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;

	/**
	 * construcutor que nos permite inicializar todos los atributos de nuestra clase Empleado.
	 * @param emp_no Numero que se le asigna  a cada empleado.
	 * @param nombre Nombre de cada empleado.
	 * @param apellido apellido de cada empleado.
	 * @param pobla el lugar donde vive el empleado.
	 * @param oficio Es el trabajo que va a realizar el empleado 
	 * @param salario Dinero que recibe el empleado por realizar su labor.
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
	}
	/**
	 * constructor que nos permite inicializar algunos atributos de nuestra clase empleado.
	 * @param emp_no Numero que se le asigna  a cada empleado.
	 * @param nombre Nombre de cada empleado.
	 * @param salario Dinero que recibe el empleado por realizar su labor.
	 * @param dept numero del departamento al que pertenece el empleado.
	 */
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
	}
	/**
	 * Metodo con el que obtenemor el valor del numero del empleado.
	 * @return numero del empleado.
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * metodo que nos permite cambiar el numero del empleado.
	 * @param emp_no numero del empleado
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * metodo con el que obtenemos el nombre del empleado.
	 * @return nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	


	/**
	 * metodo que nos calcula la subida de salario de los empelados.
	 * @param subida valor que se le subira al salario del empleado.
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	/**
	 * Metodo comprobar, que nos comprueba si un nombre se encuentra o no.
	 * @return false si el nombre es igual y true si es diferente. 
	 */
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
	/**
	 * @throws no tenemos exepciones.
	 */

	/**
	 * @deprecated no tenemos deprecated.
	 */
	/**
	 * @serial
	 */
}