package inheritance;
//부모(조상)클래스
public class Tv {
    int channel;
    int volume;
    void chUp(){
        channel++ ;
    }
    void chDown(){
        channel--;
    }
    void volUp(){
        volume++;
    }

    void volDown(){
        volume--;
        System.out.println(volume);
    }
}
