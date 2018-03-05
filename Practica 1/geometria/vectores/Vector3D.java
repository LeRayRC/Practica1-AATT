package geometria.vectores;

public class Vector3D extends Vector2D {
	private double z;
	public Vector3D (double x, double y, double z) {
		super( x, y );
		this.z = z;
	}
// Esta sobrecarga es un constructor de copia
	public Vector3D (Vector3D v) {
		this( v.getX(), v.getY(), v.getZ() );
	}
	public double getZ() {
		return z;
	}
	public Vector3D sumar( Vector3D v ) {
		super.sumar( (Vector2D) v );
		z += v.getZ();
		return this;
	}
	public Vector3D restar( Vector3D v ) {
		super.restar( (Vector2D) v );
		z -= v.getZ();
		return this;
	}
	public Vector3D escalar( double alfa ) {
		super.escalar( alfa );
		z *= alfa;
		return this;
	}
	public double norma() {
		return Math.sqrt( super.norma()*super.norma() + z*z );
	}
	public Vector3D rotar(int dimA, int dimB, double angulo) {
		Vector2D v;
		if ( dimA == 0 && dimB == 1 || dimA == 1 && dimB == 0 ) {
			v = new Vector2D(x, y).rotar(angulo);
			x = v.getX();
			y = v.getY();
		}
		else if (dimA == 0 && dimB == 2 || dimA == 2 && dimB == 0 ) {
			v = new Vector2D(x, z).rotar(angulo);
			x = v.getX();
			z = v.getY();
		}
		else if (dimA == 1 && dimB == 2 || dimA == 2 && dimB == 1 ) {
			v = new Vector2D(y, z).rotar(angulo);
			y = v.getX();
			z = v.getY();
		}
		return this;
	}
	public String toString() {
		return ("(" + super.df.format(x) +" , "+ super.df.format(y) + " , " + super.df.format(z) + ")");
	}
} // Vector3D
