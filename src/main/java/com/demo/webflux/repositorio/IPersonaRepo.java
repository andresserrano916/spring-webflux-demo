package com.demo.webflux.repositorio;

import com.demo.webflux.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonaRepo {
	
	Mono<Persona> registrar(Persona per);
	Mono<Persona> modificar(Persona per);
	Flux<Persona> listar();
	Mono<Persona> listarPorId(Integer id);
	Mono<Void> eliminar(Integer id);
}
