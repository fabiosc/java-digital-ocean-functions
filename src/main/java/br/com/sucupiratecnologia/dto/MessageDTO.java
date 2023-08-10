package br.com.sucupiratecnologia.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO implements Serializable {
	
	private static final long serialVersionUID = 8665886436856066664L;
	
	@Getter @Setter
	private String message;

}
