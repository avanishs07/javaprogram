class average{
    public static void main(String[] args) {
        int a[]={2,3,5,5,6};
        int sum=0,size=a.length;
        for(int i=0;i<size;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum="+sum);
        System.out.println("Average="+sum/size);

    }
}
