package com.gpcoder.patterns.behavioral.strategy.sort;

import java.util.List;

public class QuickSort implements SortStrategy {

	@Override
	public <T> void sort(List<T> items) {
		System.out.println("Quick sort");
	}
}
