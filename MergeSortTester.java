public class MergeSortTester {
        public static void populate( int[] arr ) {
                for( int i = 0 ; i < arr.length ; i ++ ) {
                        arr[ i ] = ( int )( Math.random() * 101 ) ;
                }
        }
        
        public static void main( String[] args ) {

	    double diff0avg = 0.0; //one
	    double diff1avg = 0.0; //ten
	    double diff2avg = 0.0; //hun
	    double diff3avg = 0.0; //fivh
	    double diff4avg = 0.0; //tho
	    double diff5avg = 0.0; //tentho
	    double diff6avg = 0.0; //huntho
	    double diff7avg = 0.0; //mil
	    double diff8avg = 0.0; //tenmil
	    double diff9avg = 0.0; //hunmil
		
	    for (int i = 0; i < 1000; i++){
	    
				int[] test1 = new int[ 10 ] ;
				int[] test2 = new int[ 10 ] ;
				int[] test3 = new int[ 10 ] ;
				int[] test4 = new int[ 10 ] ;
		
                int[] one = new int[ 1 ] ;
                int[] ten = new int[ 10 ] ;
                int[] hun = new int[ 100 ] ;
                int[] twfi = new int[ 250 ] ;
                int[] fivh = new int[ 500 ] ;
                int[] tho = new int[ 750 ] ;
		int[] tentho = new int[ 843 ] ;
		int[] huntho = new int[ 932 ] ;
		int[] mil = new int[ 1238 ] ;
		int[] tenmil = new int[ 1485 ] ;
		int[] hunmil = new int[ 1573 ] ;

                
				populate( test1 ) ;
				populate( test2 ) ;
				populate( test3 ) ;
				populate( test4 ) ;
				
                populate( one ) ;
                populate( ten ) ;
                populate( hun ) ;
                populate( twfi ) ;
                populate( fivh ) ;
                populate( tho ) ;
		populate( tentho ) ;
		populate( huntho ) ;
		populate( mil ) ;
		populate( tenmil ) ;
		populate( hunmil ) ;

		long startt0 = System.nanoTime() ;
                Mergesort.sort( test1 ) ;
                long endt0 = System.nanoTime() ;
                long difft0 = endt0 - startt0 ;
		
		long startt1 = System.nanoTime() ;
                Mergesort.sort( test2 ) ;
                long endt1 = System.nanoTime() ;
                long difft1 = endt1 - startt1 ;
		
		long startt2 = System.nanoTime() ;
                Mergesort.sort( test3 ) ;
                long endt2 = System.nanoTime() ;
                long difft2 = endt2 - startt2 ;
		
		long startt3 = System.nanoTime() ;
                Mergesort.sort( test4 ) ;
                long endt3 = System.nanoTime() ;
                long difft3 = endt3 - startt3 ;
                
                long start0 = System.nanoTime() ;
                Mergesort.sort( one ) ;
                long end0 = System.nanoTime() ;
                long diff0 = end0 - start0 ;
                
                long start1 = System.nanoTime() ;
                Mergesort.sort( ten ) ;
                long end1 = System.nanoTime() ;
                long diff1 = end1 - start1 ;
                
                long start2 = System.nanoTime() ;
                Mergesort.sort( hun ) ;
                long end2 = System.nanoTime() ;
                long diff2 = end2 - start2 ;
                
                /*long start5 = System.nanoTime() ;
                Mergesort.sort( twfi ) ;
                long end5 = System.nanoTime() ;
                long diff5 = end5 - start5 ; */
                
                long start3 = System.nanoTime() ;
                Mergesort.sort( fivh ) ;
                long end3 = System.nanoTime() ;
                long diff3 = end3 - start3 ;
                
                long start4 = System.nanoTime() ;
                Mergesort.sort( tho ) ;
                long end4 = System.nanoTime() ;
                long diff4 = end4 - start4 ;

		long start5 = System.nanoTime() ;
                Mergesort.sort(tentho ) ;
                long end5 = System.nanoTime() ;
                long diff5 = end5 - start5 ;
		
		long start6 = System.nanoTime() ;
                Mergesort.sort( huntho ) ;
                long end6 = System.nanoTime() ;
                long diff6 = end6 - start6 ;

		long start7 = System.nanoTime() ;
                Mergesort.sort( mil ) ;
                long end7 = System.nanoTime() ;
                long diff7 = end7 - start7 ;

		long start8 = System.nanoTime() ;
                Mergesort.sort( tenmil ) ;
                long end8 = System.nanoTime() ;
                long diff8 = end8 - start8 ;
		
		long start9 = System.nanoTime() ;
                Mergesort.sort( hunmil ) ;
                long end9 = System.nanoTime() ;
                long diff9 = end9 - start9 ;

                
                //TIME IN MS
                diff0avg += diff0 / 1000000.0  ; //one
                diff1avg += diff1 / 1000000.0  ; //ten
                diff2avg += diff2 / 1000000.0  ; //hun
                diff3avg += diff3 / 1000000.0  ; //fivh
                diff4avg += diff4 / 1000000.0  ; //tho
                diff5avg += diff5 / 1000000.0  ; //tentho
	        diff6avg += diff6 / 1000000.0  ; //huntho
	        diff7avg += diff7 / 1000000.0  ; //mil
	        diff8avg += diff8 / 1000000.0  ; //tenmil
	        diff9avg += diff9 / 1000000.0  ; //hunmil

	    }

	    diff0avg /= 1000.0;
	    System.out.println(diff0avg);
	    System.out.println(diff1avg / 1000.0);
	    System.out.println(diff2avg / 1000.0);
	    System.out.println(diff3avg / 1000.0);
	    System.out.println(diff4avg / 1000.0);
	    System.out.println(diff5avg / 1000.0);
	    System.out.println(diff6avg / 1000.0);
	    System.out.println(diff7avg / 1000.0);
	    System.out.println(diff8avg / 1000.0);
	    System.out.println(diff9avg / 1000.0);
	    
	        
        }
}
