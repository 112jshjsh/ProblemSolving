class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) 
            if (arr[i] < min)
                min = arr[i];
        
        int[] answer = new int[arr.length-1];
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++)
            if (arr[i] != min) 
                answer[idx++] = arr[i];
        
        return answer;
    }
}