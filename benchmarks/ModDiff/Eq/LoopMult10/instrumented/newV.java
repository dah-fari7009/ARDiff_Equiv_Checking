package demo.benchmarks.ModDiffEq.LoopMult10.instrumented;
public class newV {
	public static int snippet(int x) {
		if (x>=9 && x<12){
			int c=0;
			for (int i=1;i<=x;++i)
				c+=10;
			return c;
		}
		return 0;
	}
}
