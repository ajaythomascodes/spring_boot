/**
 * 
 */
package com.verizon.nautilus.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thoaj3f
 *
 */
@RestController
public class NautilusServiceController {
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public ResponseEntity<String> heartBeat(){
		return new ResponseEntity<String>("pong", HttpStatus.OK);
	}
}
