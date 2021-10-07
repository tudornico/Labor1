import java.util.List;

public class Aufgabe2 {
    public int max_number(List<Integer> input){
        int max=0;
        for(int i = 0; i<input.size();i++){
            if(max<input.get(i)){
                max = input.get(i);
            }
        }
        return max;
    }
    public int min_number(List<Integer> input){
        int min = input.get(0);
        for(int i = 0 ; i<input.size();i++){
            if(input.get(i)<min){
                min = input.get(i);
            }
        }
        return min;
    }
    public int max_sum(List<Integer> input){
        int sum= 0 ;
        while(input.size() != 1){
            sum+=max_number(input);
            input.remove(max_number(input));
        }
        return sum;
    }

    public int min_sum(List<Integer> input){
        int sum= 0 ;
        while(input.size() != 1){
            sum+=min_number(input);
            input.remove(min_number(input));
        }
        return sum;
    }

}
