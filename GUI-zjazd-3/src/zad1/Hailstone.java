package zad1;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer> {

    private int startNumber;

    public Hailstone(int startNumber) {
        this.startNumber=startNumber;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
        int tmp ;
            @Override
            public boolean hasNext() {
                if (tmp !=1 ){
                    tmp=startNumber;
                    if (startNumber % 2 != 0){
                        startNumber=startNumber*3+1;
                    }
                    else
                        startNumber=startNumber/2;
                    return true;
                }
                else {
                    return false;
                }
            }

            @Override
            public Object next() {
                return tmp;
            }

        };
    }
}
