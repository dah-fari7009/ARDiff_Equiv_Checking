package demo.benchmarks.ModDiffEq.LoopMult5.instrumented;
public class InewVGradDiff{
	public static int snippet(int x) {
		if (x>=5 && x<7){
int c = UF_c_1();
			for (int i=1;i<=5;++i)
				c+=x;
			return c;
		}
		return 0;
	}
public static int UF_c_1(){
return 1;
}
public static void main(String[] args){
InewVGradDiff temp = new InewVGradDiff();
temp.snippet(1);
}
}
