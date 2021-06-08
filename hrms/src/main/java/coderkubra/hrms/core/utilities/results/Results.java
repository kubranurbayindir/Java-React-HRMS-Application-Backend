package coderkubra.hrms.core.utilities.results;

public class Results {
	private boolean success;
	private String message;
	   
	   public Results(boolean success) {
		   this.success = success;
	   }
	   
	   public Results(boolean success,String message) {
		   this(success);
		   this.message = message;
	   }
	   
	   public boolean isSuccess() {
		   return this.success;
	   }
	   
	   public String getMessage() {
		   return this.message;
	   }

}
