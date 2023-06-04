package br.com.collection.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {
	
	public static ArrayList<Object> asList(Object... args) {
		return new ArrayList<>(Arrays.asList(args));
	}
}