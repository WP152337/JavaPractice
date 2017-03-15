/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *		|_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author			:	12bra
 * @version		:	1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int M = 1700000;
		int Member = 3;
		int J = 1500;
		long YearM = (long)M * 12 * Member * J;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", M) + "원");
		System.out.println("점포 내 직원 수 : " + Member + "명");
		System.out.println("점포 수 : " + String.format("%,d", J) + "개");
		System.out.println("\n연간 인건비 : " + String.format("%,d", (long)YearM) +"원");
	}

}