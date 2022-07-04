import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Cipher perform = new Cipher();

        Scanner sc = new Scanner(System.in);
        
        String inPut = sc.next();
        String outPut = "";

        
        for(int i=0; i<inPut.length(); i++){
            int cipher = (int)inPut.charAt(i);
            
            if((cipher > 64 && cipher < 90) || (cipher > 96 && cipher < 123)){
                cipher = perform.encoding(cipher);
                // cipher = perform.decoding(cipher);
            }

            outPut += (char)cipher;
        }
        
        System.out.println(outPut);
    }

    private int encoding(int cipher){
        cipher += 3;
        if(((cipher > 90) && (cipher < 94)) || ((cipher > 122) && (cipher < 126))){
            cipher -= 26;
        }

        return cipher;
    }

    private int decoding(int cipher){
        cipher -= 3;
        if((cipher < 65 && cipher > 61) || ((cipher < 97) && (cipher > 93))){
            cipher += 26;
        }

        return cipher;
    }
}
