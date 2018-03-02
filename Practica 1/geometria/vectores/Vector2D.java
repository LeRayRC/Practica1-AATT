package geometria.vectores;

public class Vector2D implements geometria.espacios.EspacioVectorial2D, OperacionesVector2D {

	private double x,y; 

	//Constructores 

	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}

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
		x = x*Math.cos(angulo) + y*Math.sin(angulo); 
		y = -x*Math.sin(angulo) + y*Math.cos(angulo);
		return this;
	}

	public Vector2D restar(Vector2D v ){
		this.x -= v.x;
		this.x -= v.y;
		return this; 
	}

} // Vector2D