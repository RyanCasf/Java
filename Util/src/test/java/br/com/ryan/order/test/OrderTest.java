package br.com.ryan.order.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;
import br.com.ryan.order.OrderDesc;

public class OrderTest 
{
	@Test
	public void verificarPosicoesAscToDec() throws Exception
	{
		Random random = new Random();
		List<Integer> temp = new ArrayList<Integer>();
		
		temp.add(1);
		temp.add(3);
		temp.add(4);
		temp.add(6);
		temp.add(1);
		temp.add(10);
		temp.add(12);
		temp.add(12);
		temp.add(16);
		temp.add(16);
		
		int[] posicoesTemp = OrderDesc.posicoesAscToDec(temp);
		
		for(int i=0; i<temp.size(); i++)
		{
			System.out.println(temp.get(posicoesTemp[i]));
		}
		
		for (int i=0; i<temp.size(); i++)
		{
			for (int j=0; j<temp.size(); j++)
			{
				if (temp.get(posicoesTemp[i]) > temp.get(posicoesTemp[j]) && i > j)
				{
					throw new Exception("A ordenção decrescente feri sua ordenação de grandeza!");
				}
			}
		}
	}
}