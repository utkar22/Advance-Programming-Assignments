/*
 * Name: Utkarsh Arora
 * Roll No: 2020143
 * In this question, I have used parallelization to get the value of the 
 * element at the (n,k)th position of the pascal's triangle.
 * I have used thread pool to be more effective while parallelization.
 * To optimize the code even further, I have made use of Dynamic Programming.
 * The value of the current result is stored in a matrix. Thus, a huge portion
 * of recursion calls are saved.
 */

package t_practice;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class bonus_lab extends RecursiveAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static int[][] arr = new int[40][40];
	
	private int n, k, result;
	
	bonus_lab(int n, int k){
		this.n = n;
		this.k = k;
		this.result = 0;
	}
	
	public int get_result() {
		return this.result;
	}
	
	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		if (n==0||k==0||n==k) {
			arr[n][k] = 1;
			this.result = 1;
			return;
		}
		if (arr[n][k]!=0) {
			this.result = arr[n][k];
			return;
		}
		
		bonus_lab left = new bonus_lab(this.n-1, this.k-1);
		bonus_lab right = new bonus_lab(this.n-1, this.k);
		
		left.fork();
		right.compute();
		left.join();
		
		
		this.result = left.get_result() + right.get_result();
		arr[n][k] = this.result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int no_of_threads = sc.nextInt();
		
		ForkJoinPool pool = new ForkJoinPool(no_of_threads);
		
		bonus_lab head = new bonus_lab(30,10);
		pool.invoke(head);
		
		System.out.println(head.get_result());
	}

	

}
