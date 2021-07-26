package algorithm210726;

import java.util.ArrayList;
import java.util.Scanner;

//리스트 사용
public class UseList {

    //메인
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        RetainAll_RemoveAll all = new RetainAll_RemoveAll();

        System.out.print("List 사이즈 : ");
        int size = scanner.nextInt();

        //add() + get()
        System.out.println("입력 후 값 추출");
        for (int i = 0; i < size; i++) {
            list1.add(i);
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("");

        //set() + get()
        System.out.println("set으로 수정 후 값 추출");
        for (int i = 0; i < size; i++) {
            list1.set(i, i*2);
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("");

        //size()
        System.out.print("list의 사이즈 : ");
        System.out.println(list1.size());

        //addAll()
        System.out.print("list1과 list2 합치기 : ");
        list2.addAll(list1);
        System.out.println(list2);

        //remove(), contains()
        System.out.print("list2 remove() : ");; //값도 가능
        System.out.println(list2.contains(0));
        list2.contains(0);
        System.out.println(list2.contains(100));

        //clear(), isEmpty()
        System.out.print("list2 clear전 : ");
        System.out.print(list2.isEmpty());
        list2.clear();
        System.out.printf("\n list2 clear 후 : ");
        System.out.println(list2.isEmpty());

        //indexOf(), lastIndexOf()
        System.out.print("list1 indexOf : ");
        System.out.println(list1.indexOf(4));
        System.out.print("list1 lastIndexOf : ");
        System.out.println(list1.lastIndexOf(4));

        all.example(list1);

        //containsAll()
        //toArray()
    }
}

//retainAll()
//removeAll()
//addAll()
class RetainAll_RemoveAll {
    public static void example(ArrayList<Integer> list) {
        ArrayList<Integer>list1 = (ArrayList<Integer>) list.clone();
        ArrayList<Integer>list2 = new ArrayList<Integer>();

        list2.add(list1.get(0));
        list2.add(list1.get(1));

        System.out.print("list1 : ");
        System.out.println(list1);

        System.out.print("retainAll() : ");
        list1.retainAll(list2);
        System.out.println(list1);

        System.out.print("addAll() : ");
        list1.addAll(list2);
        System.out.println(list1);

        System.out.print("removeAll : ");
        list1.removeAll(list2);
        System.out.println(list1);
    }
}
