package Searching;

public class SearchUtils {

    //Linear search is nothing but looping each element and find the element
    public static boolean linearSearch(String[] arrOfElements, String elementToFind){
        for(String ele : arrOfElements){
            if(ele.equalsIgnoreCase(elementToFind)){
                return true;
            }
        }
        return false;
    }

    //Binary search is applicable only for sorted elements
    public static boolean binarySearch(int[] arrOfElements, int elementToFind){
        int first = 0;
        int last = arrOfElements.length;
        while(first>last){
            int mid = (int) Math.floor((first + last)/2);
            if(elementToFind == arrOfElements[mid]){
                return true;
            }else if(elementToFind > arrOfElements[mid]){
                first = mid+1;
            }else {
                last = mid -1;
            }
        }
        return false;
    }


}
