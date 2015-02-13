package lib;

public class Calculation_lib {

		// TODO Auto-generated method stub
		private int m,n;

		public Calculation_lib(int m, int n) {
			super();
			this.m = m;
			this.n = n;
		}
		public int getPlus(){
	        return m + n;
	    }
		public int getMinus(){
	        return m - n;
	    }
		public double getMultiple(){
			return m * n;
		}
		public double getDivide(){
			return m / n;
		}
		

	}
