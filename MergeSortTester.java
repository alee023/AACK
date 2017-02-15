/*======================================
  class MergeSortTester

  ALGORITHM: This algorithm starts on the basic idea that a single card is sorted with itself. It takes a deck and divides it repeatedly in half until each subdivision is one card long. Then, there is a merge method that takes two sorted lists and puts them together. The merge method is used to recursively put the subdivisions of the deck back together.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn): Since the recursive aspect of the mergesort algo splits the dataset in two every time, the runtime would be logn. (Essentially (½)^(# of divisions)) However, since the sort method also calls the merge method, and the merge method runs through each dataset linearly, the total runtime would be O(nlogn).

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1   	time: 1.1934875
  n=10  time: 1.137418125
  n=100 time: 1.359273375
  n=250 time: 1.973757
  n=500 time: 2.158850125
  n=1000 time: 2.412124375

  ANALYSIS:
  see google doc link in README.md in the root of the AACK repo
  ======================================*/

/*======================================
public class MergeSortTester {
	public static void populate( int[] arr ) {
		for( int i = 0 ; i < arr.length ; i ++ ) {
			arr[ i ] = ( int )( Math.random() * 101 ) ;
		}
	}
	
	public static void main( String[] args ) {
		int[] one = new int[ 1 ] ; 
		int[] ten = new int[ 10 ] ;
		int[] hun = new int[ 100 ] ;
		int[] twfi = new int[ 250 ] ;
		int[] fivh = new int[ 500 ] ;
		int[] tho = new int[ 1000 ] ;
		
		populate( one ) ;
		populate( ten ) ;
		populate( hun ) ;
		populate( twfi ) ;
		populate( fivh ) ;
		populate( tho ) ;
		
		/*
		long start0 = System.nanoTime() ; 
		Mergesort.sort( one ) ;
		long end0 = System.nanoTime() ;
		long diff0 = end0 - start0 ;
		*/
		/*
		long start1 = System.nanoTime() ; 
		Mergesort.sort( ten ) ;
		long end1 = System.nanoTime() ;
		long diff1 = end1 - start1 ;
		*/
		/*
		long start2 = System.nanoTime() ; 
		Mergesort.sort( hun ) ;
		long end2 = System.nanoTime() ;
		long diff2 = end2 - start2 ;
		*/
		/*
		long start5 = System.nanoTime() ; 
		Mergesort.sort( twfi ) ;
		long end5 = System.nanoTime() ;
		long diff5 = end5 - start5 ;
		*/
		/*
		long start3 = System.nanoTime() ; 
		Mergesort.sort( fivh ) ;
		long end3 = System.nanoTime() ;
		long diff3 = end3 - start3 ;
		*/
		/*
		long start4 = System.nanoTime() ; 
		Mergesort.sort( tho ) ;
		long end4 = System.nanoTime() ;
		long diff4 = end4 - start4 ;
		*/
		
		System.out.println( "TIME IN MS" ) ;
		// System.out.println( diff0 / 1000000.0 ) ;
		// System.out.println( diff1 / 1000000.0 ) ;
		// System.out.println( diff2 / 1000000.0 ) ;
		// System.out.println( diff3 / 1000000.0 ) ;
		// System.out.println( diff4 / 1000000.0 ) ;
		// System.out.println( diff5 / 1000000.0 ) ;
	}
}


