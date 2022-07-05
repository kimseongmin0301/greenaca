import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Cipher perform = new Cipher();

        Scanner sc = new Scanner(System.in);
        
        String inPut = sc.nextLine();
        String outPut = "";

        //문자 길이만큼 반복
        for(int i=0; i<inPut.length(); i++){
            int cipher = inPut.charAt(i);      //첫 문자부터 아스키코드값으로 형변환
            
            if((cipher > 64 && cipher < 90) || (cipher > 96 && cipher < 123)){      //영어만 바뀌게 조건적용
                cipher = perform.encoding(cipher);
                // cipher = perform.decoding(cipher);
            }

            outPut += (char)cipher;
        }
        
        System.out.println(outPut);
    }

    private int encoding(int cipher){       //암호화
        cipher += 3;
        if(((cipher > 90) && (cipher < 94)) || ((cipher > 122) && (cipher < 126))){
            cipher -= 26;
        }

        return cipher;
    }

    private int decoding(int cipher){       //복호화
        cipher -= 3;
        if((cipher < 65 && cipher > 61) || ((cipher < 97) && (cipher > 93))){
            cipher += 26;
        }

        return cipher;
    }
}
