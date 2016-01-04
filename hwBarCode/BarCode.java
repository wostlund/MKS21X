public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private static final String[]code = {
	"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|",
	"|::|:", "|:|::"
    };

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	int z;
	z = Integer.parseInt(zip);
	try{
	    if((z/10000)%10 != z/10000){
		throw new RuntimeException();
	    }
	    _zip = ""+z;
	    for(int i=0; i<5; i++){
		_checkDigit += z%((int)(Math.pow(10, i+1)))/(int)Math.pow(10,i);
	    }
	    _checkDigit%=10;
	}catch(RuntimeException e){
	    System.out.println("Error: Invalid zip code input");
	}
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	this(x._zip);
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int x = Integer.parseInt(_zip), ans=0;
	for(int i=0; i<5; i++){
	    ans+=x%10;
	    x=x/10;
	}
	return ans%10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	int zip = Integer.parseInt(_zip)+checkSum();
	String ans1=""+zip+checkSum(), ans2="";
	for(int i=6; i>0; i--){
	    int x = zip/((int)(Math.pow(10, i)));
	    zip%=10;
	    ans2 += code[x];
	}
	return ans1+" "+ans2;
    }

    private String getZip(){
	return _zip;
    }

    private int getDigit(){
	return _checkDigit;
    }

    public boolean equals(Object other){
	return (other instanceof BarCode) &&
	    (this==other || (this._zip).equals(((BarCode)other).getZip()));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	if(equals(other) && _checkDigit == ((BarCode)other).getDigit()){
	    return 1;
	}return 0;
    }
    // postcondition: compares the zip + checkdigit 

}
