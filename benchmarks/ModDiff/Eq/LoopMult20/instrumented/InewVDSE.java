package demo.benchmarks.ModDiffEq.LoopMult20.instrumented;
public class InewVDSE{
	public static int snippet(int x) {
		if (x>=18 && x<22){
int c = UF_c_1();
			for (int i=1;i<=x;++i)
				c+=20;
			return c;
		}
		return 0;
	}
public static int UF_c_1(){
return 1;
}
public static void main(String[] args){
InewVDSE temp = new InewVDSE();
temp.snippet(1);
}
}
