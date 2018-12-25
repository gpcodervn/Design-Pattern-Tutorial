package com.gpcoder.patterns.behavioral.strategy.sort;

import java.util.List;

public interface SortStrategy {

	<T> void sort(List<T> items);
}
