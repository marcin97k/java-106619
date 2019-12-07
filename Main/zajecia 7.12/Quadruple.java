public class Pair<L,R> {
	private L left;
	private R right;
         
	protected Pair(L left, R right) { 
		this.left = left;
		this.right = right;
	}
	public L getLeft() {
		return left;
	}
	public void setLeft(L left) {
		this.left = left;
	}
	public R getRight() {
		return right;
	}
	public void setRight(R right) {
		this.right = right;
	}

	public static <L,R> Pair<L,R> of(L left, R right){
		return new Pair<L,R>(left, right);
	}
}
       
public class Triple<L,M,R> extends Pair<L,R> {
	private M middle;
	protected Triple(L left, M middle, R right) {
		super(left, right);
		this.middle = middle;
	}
	
	public M getMiddle() {
		return middle;
	}

	public void setMiddle(M middle) {
		this.middle = middle;
	}
}

public class Quadruple<L,M,R,B> extends Triple<L,M,R> {
	private B back;
	protected Quadruple(L left, M middle, R right, B back) {
		super(left, middle, right);
		this.back = back;
	}
	
	public B getBack() {
		return back;
	}
	
	public void setBack(B back) {
		this.back = back;
	}
	

  public static void main(String[] args) {
	  Triple<String, Integer, String> triple = new Quadruple<String, Integer, String, Integer>("AAA", 1, "BBB", 2);
	  System.out.println(triple.getLeft());
  }

}