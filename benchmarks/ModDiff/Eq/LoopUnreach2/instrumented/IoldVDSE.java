package demo.benchmarks.ModDiffEq.LoopUnreach2.instrumented;
public class IoldVDSE{
	public static int snippet(int a, int b) {
int c = UF_c_1();
		if (a<0) {
			if (a==b) {
				for (int i = 1; i <= b; ++i)
					c += a;
			}
		}
		return c;
	}
public static int UF_c_1(){
return 1;
}
public static void main(String[] args){
IoldVDSE temp = new IoldVDSE();
temp.snippet(1,1);
}
}
