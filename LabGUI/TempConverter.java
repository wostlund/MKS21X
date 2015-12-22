public class TempConverter{

    public static double CtoF(double temp){
	return temp*(9.0/5.0)+32;
    }

    public static double FtoC(double temp){
	return (temp-32)*(5.0/9.0);
    }
}
