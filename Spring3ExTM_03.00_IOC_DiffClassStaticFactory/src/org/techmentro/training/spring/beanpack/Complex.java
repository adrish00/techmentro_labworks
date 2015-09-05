/**
 * 
 */
package org.techmentro.training.spring.beanpack;



/**
 * @author Adrish
 *
 */
public class Complex implements Number {

	private int r;
	private int i;
	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @param r
	 * @param i
	 */
	public Complex(int r, int i) {
		super();
		this.r = r;
		this.i = i;
	}

	/**
	 * 
	 */
	public Complex() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.techmentro.training.spring.beanpack.Number#display()
	 */
	@Override
	public void display() {
		System.out.println(r+"+"+i);
		
	}

	/* (non-Javadoc)
	 * @see org.techmentro.training.spring.beanpack.Number#Add(org.techmentro.training.spring.beanpack.Number)
	 */
	@Override
	public Number add(Number n) {
		// TODO Auto-generated method stub
		Complex c = (Complex)n;
		int r = this.r+c.r;
		int i = this.i+c.i;
		return new Complex(r,i);
	}
	
}
