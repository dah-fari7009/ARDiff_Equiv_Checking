package demo.benchmarks.ModDiffNeq.LoopMult15.instrumented;
public class InewVGradDiff{
	public static int snippet(int x) {
		if (x>=13 && x<16){
			int c=0;
			for (int i=1;i<=x;++i)
				c+=15;
			return c;
		}
		return 0;
	}
public static void main(String[] args){
InewVGradDiff temp = new InewVGradDiff();
temp.snippet(1);
}
}
