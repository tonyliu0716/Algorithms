package Easy;

/**
 * Created by tao on 5/21/18.
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.

 Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 which causes all the following ones to be bad.

 You are given an API bool isBadVersion(version) which will return whether version is bad.
 Implement a function to find the first bad version. You should minimize the number of calls to the API.

 Example:

 Given n = 5

 call isBadVersion(3) -> false
 call isBadVersion(5) -> true
 call isBadVersion(4) -> true

 Then 4 is the first bad version.
 *
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion_278 {

    private boolean isBadVersion(int n) {
        if(n == 9) {
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n) {

        int left=1;
        int right=n;
        int mid=left+(right-left)/2;

        while(left<right){
            // if the mid one is a bad version, let right index go left to check if their is a earlier bad version
            if(isBadVersion(mid))
                right = mid;
            else
                // if the mid one is not a bad version, let left index go right a bit to find the first bad Version
                left = mid+1;
            mid = left+(right-left)/2;
        }
        return left;  //when left and right index meet,its the first badVersion
    }

    public static void main(String[] args) {
        FirstBadVersion_278 bad = new FirstBadVersion_278();
        System.out.println( bad.firstBadVersion(10) );
    }

}
