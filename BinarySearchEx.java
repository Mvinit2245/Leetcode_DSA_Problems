class BinarySearchEx {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid =  (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int nums[] ={1,2,3,10,15,20,90};
        int target = 90;

        // BinarySearchEx bs = new BinarySearchEx();  // Create object
        // int res = bs.search(nums, target);         // Pass both nums and target

        int res = search(nums,target);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found.");
        }
    }
}