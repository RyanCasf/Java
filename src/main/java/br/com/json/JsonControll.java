package br.com.json;

import com.google.gson.Gson;

public class JsonControll implements JsonControllInterface {
	
	@Override
	public String write(Usuario usuario) {
		if (usuario == null)
			throw new NullPointerException("usuario is null");
		
		return new Gson().toJson(usuario);
	}
}