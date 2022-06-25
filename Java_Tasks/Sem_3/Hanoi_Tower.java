package Sem_3;

class Hanoi_Tower {
    public static void main(String[] args) {
        int quantityRings = 4;
        moveRing('A', 'B', 'C', quantityRings);
    }


    static void moveRing(char a, char b, char c, int num){
        if (num == 1){
            System.out.println(String.format("From %s to %s", a, b));
        }
        else {
            moveRing(a, c, b, num -1);
            System.out.println(String.format("From %s to %s", a, b));
            moveRing(c, b, a, num - 1);
        }
    }

    
}