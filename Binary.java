// COMILANG, TAYSHAUN M.
//CITCS 1N-A

package binary;
import java.util.Scanner;
public class Binary {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int prompt = 1;
        
        for(int o=0; o < prompt; o++) {
            
            System.out.print("Type a decimal: ");
            int decimal = scan.nextInt();
            char[] bin = new char[255];
            int size = 1;
            
            for(int i=0; i < size; i++) {
                if(decimal % 2 != 0) {
                    bin[size] = '1';
                }
                else {
                    bin[size] = '0';
                }
                decimal = decimal / 2;
                size++;
                if(decimal==0) {
                    i = size;
                }
            }
            
            System.out.print("Binary : ");
            for(int i=size; i > 0; i--) {
                System.out.print(bin[i]);  
            }
            
            System.out.print("\n\n");
            System.out.print("Type GO to convert again, STOP to exit : ");
            scan.nextLine();
            String type = scan.nextLine();
            
            if(type.equals("STOP") || type.equals("stop") || type.equals("Stop")) {
                prompt = 0;
            }
            
            prompt++;
        }
    }
}
