package strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort<E> extends AbstractSortingStrategy<E> {

	public SelectionSort(Comparator<E> cmp) { 
		super("SelectionSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 
		for (int i=n-1; i>0; i--) {
			int mpi = 0; 
			for (int j=0; j<i; j++) 
				if (cmp.compare(dataSet.get(j), dataSet.get(mpi)) > 0)
					mpi = j; 
			SortingUtils.swapListElements(dataSet, mpi, i); 
		}
	}

}
