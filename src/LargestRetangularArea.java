public class LargestRetangularArea {
    public static int maxArea(int[] arr)
    {
        int res=0;

        for(int i=0;i< arr.length;i++)
        {
            int count=1;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>arr[i])
                    count=count+1;
                else
                    break;;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                    count=count+1;
                else
                    break;;
            }
            int temp=count*arr[i];
            res=temp>res?temp:res;

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={11,3,4,4,1,5};
        System.out.println(maxArea(arr));

    }
}
