public class Sorts{
    public static void selection(int jeff[]){
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

    public static void insertion(int jeff[]){
	for (int i=0; i<jeff.length; i++){
	    for(int p=i; p>0 && jeff[p]<jeff[p-1] ; p--){
		int k = jeff[p];
		jeff[p]=jeff[p-1];
		jeff[p-1] = k;
	    }
	}
    }

    public static void main(String[]args){
	int[] m = {2, 4, 1, 2, 4, 2, 12, 4, 3, 23, 43, 234, 43, 342, 1};
	insertion(m);
	for(int i=0; i<m.length; i++){
	    System.out.print(m[i]+" ");
	}
    }
}
