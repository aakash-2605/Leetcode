//Mountain Array -> Bitonic Array 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end - start)/2;
        if(arr[mid] > arr[mid +1]){
                end=mid;
                return binsearch(arr,start,end);
        }
        else{
            start=mid+1;
            return binsearch(arr,start,end);
        }   
        }
    public int binsearch(int[] arr,int start,int end){
        int mid=0;
        while(start < end) {
            // find the middle element
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) end=mid;
            else start=mid+1;
        }
        return start;
    }
}