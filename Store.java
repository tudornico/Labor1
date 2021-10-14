import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<USB> usb_selection;
    private List<Keyboard> keyboard_selection;

    public List<USB> getUsb_selection() {
        return usb_selection;
    }

    public void setUsb_selection(List<USB> usb_selection) {
        this.usb_selection = usb_selection;
    }

    public List<Keyboard> getKeyboard_selection() {
        return keyboard_selection;
    }

    public void setKeyboard_selection(List<Keyboard> keyboard_selection) {
        this.keyboard_selection = keyboard_selection;
    }

    public Store(List<USB> usb_selection, List<Keyboard> keyboard_selection) {
        this.usb_selection = usb_selection;
        this.keyboard_selection = keyboard_selection;
    }

    public double cheapest_keyboard() {
        double minimum= this.keyboard_selection.get(0).getPrice();
        for(int i =0 ; i<this.keyboard_selection.size(); i++){
            if(minimum> this.keyboard_selection.get(i).getPrice()){
                minimum = this.keyboard_selection.get(i).getPrice();
            }
        }
        return minimum;
    }
    public double most_expensive(){
        double max= this.keyboard_selection.get(0).getPrice();
        for(int i =0 ; i<this.keyboard_selection.size() && i<this.usb_selection.size(); i++){
            if(max< this.keyboard_selection.get(i).getPrice()){
                max = this.keyboard_selection.get(i).getPrice();
            }
            if(max < this.usb_selection.get(i).getPrice()) {
                max = this.keyboard_selection.get(i).getPrice();
            }
        }
        return max;
    }
    //suchen wir durch die listen und finden wir
    public double most_expensive_USB(double budget){
        double result=-1,var=-1;
        for(int i=0;i<this.keyboard_selection.size();i++){
            for(int j =0;i<this.usb_selection.size();j++){
                if(this.keyboard_selection.get(i).getPrice()+this.usb_selection.get(j).getPrice()<=budget && this.keyboard_selection.get(i).getPrice()+this.usb_selection.get(j).getPrice()>result)
                    result=this.keyboard_selection.get(i).getPrice()+this.usb_selection.get(j).getPrice();
            }
        }

        return result;
    }

}