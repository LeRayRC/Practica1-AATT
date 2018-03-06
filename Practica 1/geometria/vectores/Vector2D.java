package geometria.vectores;

public class Vector2D implements geometria.espacios.EspacioVectorial2D, OperacionesVector2D {

	protected double x,y; 
	/*
	Para formatear correctamente el numero utilizariamos la siguiente
	intruccion a la hora de representar los elementos del vector
	String.format("% .3e",#)
	# Puede ser cualquier coordenada del vector 

	La clase locale se puede utilizar para representar los numeros
	en funcion de las convenciones que se establezcan en otros paises. 
	p.e: si quisiesemos utilizar la notacion americana: 
	protected NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); 
	posteriormente deberiamos formatear los numeros para aplicar este
	convención.
	*/

	//Constructores 

	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}

	//Contructor sobrecargado. 

	public Vector2D(double x){
		this(x,0);
	}

	//Getter 

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	//Setter 

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}

	//Metodos que me comprometo a implementar. 
	//Sumar y escalar son de EspacioVectorial2D.

	public Vector2D sumar (Vector2D v){
		this.x += v.x;
		this.y += v.y;
		return this; 
	}

	public Vector2D escalar(double a){
		x *= a;
		y *= a;
		return this;
	}

	//Norma, rotar y restar son de OperacionesVector2D. 

	public double norma (){
		return Math.sqrt(x*x + y*y);
	}

	public Vector2D rotar(double angulo){
		double x1 = x*Math.cos(angulo) + y*Math.sin(angulo); 
		double y1 = (-x*Math.sin(angulo)) + y*Math.cos(angulo);
		setX(x1);
		setY(y1);
		return this;
	}

	public Vector2D restar(Vector2D v ){
		this.x -= v.x;
		this.y -= v.y;
		return this; 
	}

	public String toString() {
		//return ("(" + df.format(x) +" , "+ df.format(y) + ")");
		return ("(" + String.format("% .3e",x) + " , "+ String.format("% .3e",y) + ")");
	}

} // Vector2D