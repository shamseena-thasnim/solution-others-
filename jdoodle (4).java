    public static int getTriangleArea(List<Integer> xAxis, List<Integer> yAxis) {
    // Write your code here
    int area =0;
    int n = xAxis.size();
    int x[]=new int[xAxis.size()];
    for (int i = 0; i <xAxis.size(); i++) {
        x[i]=xAxis.get(i);
    }
    int y[]=new int[yAxis.size()];
    for (int i = 0; i <yAxis.size(); i++) {
        y[i]=yAxis.get(i);
    }
    for (int i = 0; i < n; i++) {
        int j = (i+1)%n;
        long term = (long) x[i] * y[j] - (long) x[j] * y[i];
        area +=term;
    }
    return Math.abs(area)/2;
    
}
}