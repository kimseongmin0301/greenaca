public class Sort {
    public static void main(String[] args) {
        insertSort();
        selectSort();
        bubbleSort();
    }

    //삽입정렬
    static void insertSort(){
        int[] data = {10,6,7,9,3,4,2,1,5,8};
        int key;
        int j;
        for(int i=0; i<9; i++){
            key = data[i+1];
            for(j=i; j>-1; j--){
                if(data[j] > key){
                    data[j+1] = data[j];
                }else{
                    break;
                }
            }
            data[j+1] = key;
        }

        for(int i=0; i<10; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    //선택정렬
    static void selectSort(){
        int[] data = {10,6,7,9,3,4,2,1,5,8};
        int temp;
        for(int i=0; i<9; i++){
            for(int j= i+1; j<10; j++){
                if(data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    //버블정렬
    static void bubbleSort(){
        int[] data = {10,6,7,9,3,4,2,1,5,8};
        int temp;
        for(int i=1; i<10; i++){
            for(int j=0; j<10-i; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
