package demo.benchmarks.ModDiffEq.LoopMult20.instrumented;
public class IoldVDSE{
	public static int snippet(int x) {
		if (x>=18 && x<22){
int c = UF_c_1();
			for (int i=1;i<=20;++i)
				c+=x;
			return c;
		}
		return 0;
	}
public static int UF_c_1(){
return 1;
}
public static void main(String[] args){
IoldVDSE temp = new IoldVDSE();
temp.snippet(1);
}
}
