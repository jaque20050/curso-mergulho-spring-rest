package com.algaworks.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.logistica.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Jaqueline");
		cliente1.setTelefone("11-966016191");
		cliente1.setEmail("jaque20050@hotmail.com");

		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Rodrigo");
		cliente2.setTelefone("11-9999999");
		cliente2.setEmail("rodrigo20050@hotmail.com");

		return Arrays.asList(cliente1, cliente2);
	}
}
