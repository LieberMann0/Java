public class Triangular_Num {

    public static void main(String[] args) {

        
        int tri_Num(int k) {
            if(k==1)
                return 1;
            else
                return(k + tri_Num(k-1));
        }        
    }
}