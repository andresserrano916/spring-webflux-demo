package com.demo.webflux.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);

	@Override
	public Mono<Persona> registrar(Persona per) {
		LOG.info(per.toString());
		return Mono.just(per);
	}

	@Override
	public Mono<Persona> modificar(Persona per) {
		LOG.info(per.toString());
		return Mono.just(per);
	}

	@Override
	public Flux<Persona> listar() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona(1, "Curso"));
		personas.add(new Persona(2, "WebFlux"));
		personas.add(new Persona(2, "Reactive"));
		
		return Flux.fromIterable(personas);
	}

	@Override
	public Mono<Persona> listarPorId(Integer id) {
		return Mono.just(new Persona(id, "WebFlux"));
	}

	@Override
	public Mono<Void> eliminar(Integer id) {
		return Mono.empty();
	}

}
