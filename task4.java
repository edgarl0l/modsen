package mod;

public class task4 {
    public static int findnemo(int[] nums) {
        
        int[] count = new int[100001]; 

        for (int num : nums) {
            count[num]++;
        }

        for (int num : nums) {
            if (count[num] == 1) {
                return num; 
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 2};
        int result = findnemo(array);
        if(result == -1) {
            System.out.println("false"); 
        }else
        
        System.out.println(true); 
    }
}
