import java.util.LinkedList;

public class IntersectingPoint {

    public static int findIntersect(LinkedList listA, LinkedList listB){
        int evaluateA;
        int evaluateB;
        int result = 0;

        for(int i = 0; i < listA.size(); i++){
            evaluateA = (int) listA.get(i);
            evaluateB = (int) listB.get(i);

            if(evaluateA == evaluateB){
                result = listA.indexOf(evaluateA);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();

        listA.add(0, 12);
        listA.add(1, 55);
        listA.add(2, 43);
        listA.add(3, 67);
        listA.add(4, 102);
        listA.add(5, 27);

        listB.add(0, 38);
        listB.add(1, 81);
        listB.add(2, 33);
        listB.add(3, 67);
        listB.add(4, 12);
        listB.add(5, 105);

        int result = findIntersect(listA,listB);
        System.out.println(result);

    }
}
