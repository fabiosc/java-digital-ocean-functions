package br.com.sucupiratecnologia.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sucupiratecnologia.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerTest {

	@GetMapping(value="write-message/{message}")
	public ResponseEntity<MessageDTO> showMessage(@PathVariable("message") String message) {
		log.info("Return message: " + message);
		MessageDTO mDTO = new MessageDTO();
		mDTO.setMessage(message);
		return ResponseEntity.ok(mDTO);
	}
	
}
