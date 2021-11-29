package assignment4;

public class Calculator<T> {
	private T op1;
	private T op2;
	
	Calculator(T op1, T op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public void print() {
		if (this.op1 instanceof Integer) {
			System.out.println("What is the result of division of "+this.op1+" by "+this.op2);
		}
		else if (this.op1 instanceof String) {
			System.out.println("What is the result of concatination of "+this.op1+" and "+this.op2);
		}
	}
	
	public boolean if_correct(T answer){
		if (this.op1 instanceof Integer) {
			if (((Integer)this.op1/(Integer)this.op2)==(Integer)answer) {
				System.out.println("Correct answer");
				return true;
			}
			System.out.println("Wrong answer");
			return false;
		}
		else if (this.op1 instanceof String) {
			if (((String)answer).equals(((String)this.op1 + (String)this.op2))) {
				System.out.println("Correct answer");
				return true;
			}
			System.out.println("Wrong answer");
			return false;
		}
		
		return false;
	}
}
