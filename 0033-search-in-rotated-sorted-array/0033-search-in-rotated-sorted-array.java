class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid =(s+e)/2;
            if(arr[mid]==target) return mid;
            //left half is sorted or not
            if(arr[s]<=arr[mid]){
                //check element is present or not
                if(arr[s]<=target &&  target<=arr[mid]){
                    e=mid-1;
                }
                else s=mid+1;
            }
            else {
                  if(arr[mid]<=target && target<=arr[e]){
                    s=mid+1;
                }
                else e=mid-1;
            }


        }
        return -1;
    }
}
