/**
 * 
 */
package org.techmentro.training.spring.clientpack;
import org.techmentro.training.spring.beanpack.Number;
import org.techmentro.training.spring.beanpack.Complex;
import org.techmentro.training.spring.beanpack.Rational;

/**
 * @author Adrish
 *
 */
public class User {

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("--Complex Show--------------------------");
		Number num1 = new Complex(2,5);
		Number num2 = new Complex(3,4);
		Number num3 = num1.add(num2);
		num1.display();
		num2.display();
		num3.display();
		System.out.println("--Rational Show--------------------------");
		Number num4 = new Rational(2,5);
		Number num5 = new Rational(3,4);
		Number num6 = num4.add(num5);
		num4.display();
		num5.display();
		num6.display();
	}
}
