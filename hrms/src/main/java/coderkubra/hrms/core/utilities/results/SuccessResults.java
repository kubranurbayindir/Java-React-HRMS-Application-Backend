package coderkubra.hrms.core.utilities.results;

public class SuccessResults extends Results {
	
	public SuccessResults() { 	//cevap vermeyeceği için boş bi construction oluştururoruz.
		super(true);
	} 
	
	public SuccessResults(String message) {
		super(true, message);
	} 

}
