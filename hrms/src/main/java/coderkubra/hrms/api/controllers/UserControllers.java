package coderkubra.hrms.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import coderkubra.hrms.core.abstracts.UserService;
import coderkubra.hrms.core.entities.User;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;

import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/api/users")
public class UserControllers {

	private UserService userService;

	@Autowired
	public UserControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	

	@PostMapping(value="/add")  //kullanıcı ekleme ıslemlerı
	public ResponseEntity<?> add(@Valid @RequestBody User user) {
		
		return ResponseEntity.ok(this.userService.add(user)) ;
	}
	
	//kullanıcıyı springboot valisation frameworku ıle kontrol etme anastasyonu
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResults<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResults<Object> errors 
		= new ErrorDataResults<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}


}
