package com.task;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class WordsSorter {
	static public String[] Sort(String str) {
		String[] words = SplitWords(str);
		List<String> list = Arrays.asList(words);
		Collections.sort(list);
		
		return list.toArray(new String[0]);
	}
	
	static private String[] SplitWords(String string) {
		String[] words = string.split("\\s+");
		for (int i = 0; i < words.length; i++) 
		    words[i] = words[i].replaceAll("[^\\w]", "");
		
		return words;
	}
}
