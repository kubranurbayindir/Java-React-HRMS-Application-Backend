package coderkubra.hrms.core.utilities.results;


public class DataResults<T> extends Results {
	private T data;

	public DataResults(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}

	public DataResults(T data, boolean success) {
		super(success);
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	
	}
}
