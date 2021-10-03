package br.com.ryan.order;

import java.util.ArrayList;
import java.util.List;

public class OrderDesc 
{
	public static int[] posicoesAscToDec(List<Integer> vetor)
	{
		int[] posicaoDescrescente = new int[vetor.size()];
			
		for (int i=0; i<vetor.size(); i++)
		{
			posicaoDescrescente[i] = 0;
			
			for (int j=0; j<vetor.size(); j++)
			{
				if (vetor.get(i).intValue() == vetor.get(j).intValue()) {
					continue;
				}
				
				if (vetor.get(i).intValue() < vetor.get(j).intValue()) {
					posicaoDescrescente[i]++;
				}
			}
		}
		
		return posicaoDescrescente;
	}
	
	public static List<Integer> fetchVetor(int tamanho)
	{
		List<Integer> temp = new ArrayList<Integer>();
		
		for (int i=0; i<tamanho ;i++)
		{
			temp.add(i);
		}
		
		return temp;
	}
}