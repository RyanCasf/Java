package br.com.collection.remover;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class ListRemove {
	
	private List<BigDecimal> list;
	
	public ListRemove(List<BigDecimal> list) {
		if (list == null)
			throw new NullPointerException("param list is null");
		
		this.list = list;
	}
	
	public int removerIterator() {
		Iterator<BigDecimal> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			if (iterator.next().compareTo(BigDecimal.ZERO) == 0) {
				iterator.remove();
			}
		}
		
		return list.size();
	}
	
	public int removerFunction() {
		list.removeIf(l -> l.compareTo(BigDecimal.ZERO) == 0);
		return list.size();
	}
}