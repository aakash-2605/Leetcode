/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length() -1;
        while(start < end){
            int mid=start +(end -start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        int res=binsearch(target,mountainArr,0,start);
        if(mountainArr.get(res) == target) return res;
        else {
            res=binsearch(target,mountainArr,start,mountainArr.length() -1);
            if(mountainArr.get(res) == target) return res;
             }
        return -1;
}
    public int binsearch(int target,MountainArray mountainArr,int start,int end){
        boolean isAscending=mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid=start+ (end - start)/2;
            if(mountainArr.get(mid)== target) return mid;
            if(isAscending){
             if(mountainArr.get(mid) < target){
                start=mid+1;
            }
            else end=mid-1;
            }
            else{
               if(mountainArr.get(mid) < target){
                end=mid-1;
            }
            else start=mid+1;
            }
        }
        return 0;
    }
}