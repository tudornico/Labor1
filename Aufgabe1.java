import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {
    public int rounding(int input){
        if(input<38){
            return input;
        }
        int index=input,counter = 0;
        while(index != 0){
            if(index % 5 == 0){
                return index;
            }
            else{
                counter++;
                if(counter >= 3)
                    return input;
            }
        }
        return 0;
    }

    public List<Integer> not_enough(List<Integer> input){
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i <input.size();i++){
            if((rounding(input.get(i))<40)){
                result.add(input.get(i));
            }

        }
        return result;
    }
    public double avreage(List<Integer> input){
        double result=0;
        for(int i=0;i<input.size();i++){
            result +=rounding(input.get(i));
        }
        return result/input.size();
    }
    public List<Integer> rounded(List<Integer> input){
     List<Integer> result = new ArrayList<Integer>();
     for(int i= 0 ;i<input.size();i++){
         result.add(rounding(input.get(i)));
     }
     return result;
    }
    public int max_note(List<Integer> input){
        int result = 0;
        for(int i = 0;i<input.size();i++){
            if(result < rounding(input.get(i)));
            result = rounding(input.get(i));
        }
        return result;
    }
}
