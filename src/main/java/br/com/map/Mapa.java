package br.com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
	
	private Map<String, List<String>> mapa = new LinkedHashMap<String, List<String>>();
	
	public Mapa() {
		List<String> lista = new ArrayList<String>(Arrays.asList("1","2","3"));
		mapa.put("1", lista);
	}
	
	public void listar() {
		for (Map.Entry<String, List<String>> m : mapa.entrySet()) {
			
			m.getKey();
			
			for (String v : m.getValue()) {
				v.toString();
			}
		}
	}
}