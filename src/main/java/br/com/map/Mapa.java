package br.com.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
	
	Map<String, List<String>> mapa = new LinkedHashMap<String, List<String>>();
	
	public void listar() {
		for (Map.Entry<String, List<String>> m : mapa.entrySet()) {
			
			m.getKey();
			
			for (String v : m.getValue()) {
				v.toString();
			}
		}
	}
}