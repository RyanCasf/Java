package br.com.sort;

import java.util.ArrayList;
import java.util.List;

public class Model 
{
	private Long chave;
	private String header;
	private String body;
	
	private List<Model> modelsFilhos = new ArrayList<>();
	
	public Model(Long chave, String header, String body) {
		this.chave = chave;
		this.header = header;
		this.body = body;
	}
	
	public Long getChave() { return chave; }
	public String getHeader() { return header; }
	public String getBody() { return body; }
	public List<Model> getModelsFilhos() { return modelsFilhos; }
	
	public void setChave(Number chave) { this.chave = (chave != null ? chave.longValue() : null); }
	public void setHeader(String header) { this.header = header; }
	public void setBody(String body) { this.body = body; }
	public void setModelsFilhos(List<Model> modelsFilhos) { this.modelsFilhos = modelsFilhos; }
	
	@Override
	public String toString() { return "["+chave+","+header+","+body+"]"; }
}