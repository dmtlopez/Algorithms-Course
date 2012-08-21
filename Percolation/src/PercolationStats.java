public class PercolationStats
{

	// perform T independent computational experiments on an N-by-N grid
	public PercolationStats(int N, int T)
	{
		if(N <= 0) throw new java.lang.IllegalArgumentException();
		if(T <= 0) throw new java.lang.IllegalArgumentException();
	}

	// sample mean of percolation threshold
	public double mean()
	{

	}

	// sample standard deviation of percolation threshold
	public double stddev()
	{

	}

	// test client, described below
	public static void main(String[] args)
	{

	}
}
