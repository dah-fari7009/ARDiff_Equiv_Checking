package demo.benchmarks.ModDiffEq.LoopMult5.instrumented;
public class IoldVGradDiff{
	public static int snippet(int x) {
		if (x>=5 && x<7){
int c = UF_c_1();
			for (int i=1;i<=x;++i)
				c+=5;
			return c;
		}
		return 0;
	}
public static int UF_c_1(){
return 1;
}
public static void main(String[] args){
IoldVGradDiff temp = new IoldVGradDiff();
temp.snippet(1);
}
}
