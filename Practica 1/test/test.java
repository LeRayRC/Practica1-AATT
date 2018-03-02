package test;
import geometria.vectores.Vector3D;
import geometria.vectores.Vector2D;
class Test {
	public static void main ( String args[] ) {
// 2D
		Vector2D v = new Vector2D( -3, 4.5 );
		System.out.println( "v = " + v );
		Vector2D w = new Vector2D( 5, 2.3 );
		System.out.println( "w = " + w );
		System.out.println( "w += v --> w = " + w.sumar(v) );
		System.out.println( "w -= v --> w = " + w.restar(v) );
		System.out.println( "|w| = " + w.norma() );
		System.out.println("rotar w 90 grados:"
			+ w.rotar( 90*Math.PI/180 /* radianes */) );
		System.out.println( "|w| = " + w.norma() );
//3D
		Vector3D a = new Vector3D( 1., 2., 3. );
		System.out.println( "a = " + a );
		Vector3D b = new Vector3D( 10., 20., 30. );
		System.out.println( "b = " + b );
		System.out.println( "b += a --> b = " + b.sumar(a) );
		System.out.println( "b -= a --> b = " + b.restar(a) );
		System.out.println( "|b| = " + b.norma() );
		System.out.println( "rotar dimensiones 0 y 1 de b 90 grados --> b = "
			+ b.rotar( 0, 1, 90*Math.PI/180 ) );
		System.out.println( "|b| = " + b.norma() );
		System.out.println( "rotar dimensiones 0 y 2 de b 90 grados --> b = "
			+ b.rotar( 0, 2, 90*Math.PI/180 ) );
		System.out.println( "|b| = " + b.norma() );
		System.out.println( "rotar dimensiones 1 y 2 de b 90 grados --> b = "
			+ b.rotar( 2, 1, 90*Math.PI/180 ) );
		System.out.println( "|b| = " + b.norma() );
	} // main
} // Test