package com.company;

public class CycleFor4 {
    public static void main(String[] args) {
    //говорим человеку: поднимайся вверх до тех пор, пока мы не крикнем снизу "стоп"
    int n=5;
    for (int i=0; i<10; i++) {
        System.out.println(i);
        if (i == 5)
            break;
    }
}
}
