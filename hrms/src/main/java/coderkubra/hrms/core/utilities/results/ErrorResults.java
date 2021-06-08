package coderkubra.hrms.core.utilities.results;

public class ErrorResults extends Results {
	
	public ErrorResults() { 	//cevap vermeyeceği için boş bi construction oluştururoruz.
		super(false);
	} 
	
	public ErrorResults(String message) {
		super(false, message);
	}
}
