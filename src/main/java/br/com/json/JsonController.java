package br.com.json;

import com.google.gson.Gson;

public class JsonController<E> implements JsonControllerInterface<E> {
	
	@Override
	public String write(E entity) {
		if (entity == null)
			throw new NullPointerException("entity is null");
		
		return new Gson().toJson(entity);
	}
}