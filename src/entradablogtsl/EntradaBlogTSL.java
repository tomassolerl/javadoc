package entradablogtsl;
 /**Clase para manejar las entradas de un blog
 * @author Tomás Soler Linares
 * @version 1.0, 03/02/2020
 */
public class EntradaBlogTSL {
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase. recibe el número de entrada, el nombre del autor 
	 * de la entrada y el texto que contiene la entrada. Si el número de entrada
	 * es negativo, lanza una excepción.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogTSL(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	/**
	 * Convierte a cadena
	 * @return Cadena generada
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada
	 * @return el número de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Devuelve el texto completo de la entrada
	 * @return el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Devuelve el nombre del autor de la entrada en mayúsculas
	 * @return el nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return el nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		EntradaBlogTSL e1=new EntradaBlogTSL(-(-3),"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}