package coderkubra.hrms.core.utilities.results;

public class ErrorDataResults<T> extends DataResults<T>  {

	public ErrorDataResults(T data, String message) {
		super(data, false ,message);
	}
	
	public ErrorDataResults(T data) {
		super(data,false);
	}
	
	public ErrorDataResults(String message) {
		super(null, false ,message);
	}
	
	public ErrorDataResults() {
		super(null, false);
	}
}
