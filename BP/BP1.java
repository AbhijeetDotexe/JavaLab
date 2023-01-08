class bp1{
    public static int min(int[] arr,int n){
        int max = 0;
        for(int i =0;i<n;i++){
            if(arr[max] > arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static int smin(int[] arr,int n,int max){
        int smax = 0;
        for(int i =0;i<n;i++){
            if(i != max && arr[smax] > arr[i]){
                smax = i;
            }
        }
        return smax;
    }
    
    public static void main(String[] args){
        String[] na = {"Elina","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane"};
        int[] arr = {341,273,278,329,445,402,388,275,243,334,412};
        System.out.print("the fastest runner is ");
        int min = min(arr,arr.length);
        System.out.print(na[min]);
        System.out.println(" " + arr[min]);

        System.out.print("the second fastest runnner is ");
        int smin = smin(arr,arr.length,min);
        System.out.print(na[smin]);
        System.out.println(" " + arr[smin]);
}
}