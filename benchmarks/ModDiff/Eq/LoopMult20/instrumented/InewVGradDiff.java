package demo.benchmarks.ModDiffEq.LoopMult20.instrumented;
public class InewVGradDiff{
	public static int snippet(int x) {
		if (x>=18 && x<22){
			int c=0;
			for (int i=1;i<=x;++i)
				c+=20;
			return c;
		}
		return 0;
	}
public static void main(String[] args){
InewVGradDiff temp = new InewVGradDiff();
temp.snippet(1);
}
}
