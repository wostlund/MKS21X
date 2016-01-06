public class Sorts{
    
    public static void selectionSort(int[]jeff){
	for(int i=0; i<jeff.length-1; i++){
	    int min = i;
	    int p = jeff[i];
	    for(int q=i; q<jeff.length; q++){
		if (jeff[min]>jeff[q]){
		    min=q;
		}
	    }
	    p=jeff[min];
	    jeff[min]=jeff[i];
	    jeff[i]=p;
	}
    }

    public static void insertionSort(int[]jeff){
	for (int i=0; i<jeff.length; i++){
	    for(int p=i; p>0 && jeff[p]<jeff[p-1] ; p--){
		int k = jeff[p];
		jeff[p]=jeff[p-1];
		jeff[p-1] = k;
	    }
	}
    }

    public static void bubbleSort(int[]jeff){
	boolean frank = true;
	for(int i=jeff.length; i>-1; i--){
	    for(int k=0; k<i-1; k++){
		if(jeff[k]>jeff[k+1]){
		    int a = jeff[k];
		    jeff[k]=jeff[k+1];
		    jeff[k+1]=a;
		    frank=false;
		}
	    }
	    if(frank){
		return;
	    }
	}
    }

    public static void fillRandom(int[]jeff){
	for(int i=0; i<jeff.length; i++){
	    jeff[i]=(int)(Math.random()*100000);
	}
    }

    public static void swap(int[]jeff, int p, int q){
	int a = jeff[p];
	jeff[p]=jeff[q];
	jeff[q]=a;
    }
    
    public static void main(String[]args){
	int[] m = {2, 4, 1, 2, 4, 2, 12, 4, 3, 23, 43, 234, 43, 342, 1};
	bubbleSort(m);
	for(int i=0; i<m.length; i++){
	    System.out.print(m[i]+" ");
	}
    }
}
