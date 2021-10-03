package br.com.ryan.enumerador;

public class EnumControl 
{
	public static void main(String[] args) 
	{
		Model model = Model.TODOS;
		
		System.out.println(model.getDescricao());
	}
}