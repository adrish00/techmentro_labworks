/**
 * 
 */
package org.techmentro.training.spring.beanpack;

/**
 * @author Adrish
 *
 */
public class Rational implements Number {
	private int p;
	private int q;
	/**
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

	/**
	 * @return the q
	 */
	public int getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(int q) {
		this.q = q;
	}

	/**
	 * @param p
	 * @param q
	 */
	public Rational(int p, int q) {
		super();
		this.p = p;
		this.q = q;
	}

	/**
	 * 
	 */
	public Rational() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.techmentro.training.spring.beanpack.Number#display()
	 */
	@Override
	public void display() {
		System.out.println(p+"/"+q +" customized operation");

	}

	/* (non-Javadoc)
	 * @see org.techmentro.training.spring.beanpack.Number#Add(org.techmentro.training.spring.beanpack.Number)
	 */
	@Override
	public Number add(Number n) {
		// TODO Auto-generated method stub
		Rational r = (Rational)n;
		int p = this.p*r.q + this.q*r.p;
		int q = this.q*r.q;
		return new Rational(p,q);
	}
}
