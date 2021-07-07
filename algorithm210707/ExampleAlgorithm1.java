package algorithm210707;

import java.util.Scanner;

//스택구현 + 스택 동작
public class ExampleAlgorithm1 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 스택의 크기");
        int arraySize = scan.nextInt();

        IntStack stack = new IntStack(arraySize);

        for (;;) {
            System.out.println("현재 데이터 수 : "
                    + stack.size() +
                    " / "
                    + stack.capacity());

            System.out.print("(1)push / (2)pop / (3)peek / (4)dump / (0)exit");
            int choice = scan.nextInt();

            int value;

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("입력 할 값 : ");
                    value = scan.nextInt();

                    try {
                        stack.push(value);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 꽉 찼음");
                    }

                    break;

                case 2:
                    try {
                        stack.pop();
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;

                case 3:
                    try {
                        stack.peek();
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;

                case 4:
                    try {
                        stack.dump();
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;
            }
        }
    }

    //스택
    private static class IntStack {
        private int max;
        private int pointer;
        private int[] stack;

        //생성자
        public IntStack(int capacity) {
             pointer = 0;
             max = capacity;

             try {
                 stack = new int[max];
             } catch (OutOfMemoryError e) {
                 max = 0;
             }
        }

        //빈 스택 에러
        public class EmptyIntStackException extends RuntimeException {
            public EmptyIntStackException() {}
        }

        //스택 오버플로우 에러
        public class OverflowIntStackException extends RuntimeException {
            public OverflowIntStackException() {}
        }

        //입력
        public int push(int x) throws OverflowIntStackException {
            if (pointer >= max) {
                throw  new OverflowIntStackException();
            }

            return stack[pointer++] = x;
        }

        //빼기
        public int pop() throws EmptyIntStackException {
            if (pointer <= 0) {
                throw new EmptyIntStackException();
            }

            return stack[--pointer];
        }

        //맨 위 값 보기
        public int peek() throws EmptyIntStackException{
            if (pointer <= 0) {
                throw new EmptyIntStackException();
            }

            return stack[pointer - 1];
        }

        //검색
        public int indexOf(int searchValue) {
            for (int i = pointer - 1; i >= 0; i--) {
                if (stack[i] == searchValue) {
                    return i;
                }
            }

            return -1;
        }

        //스택 클리어
        public void clear() {
            pointer = 0;
        }

        //스택 용량
        public int capacity() {
            return max;
        }

        //삽입된 값들의 수
        public int size() {
            return pointer;
        }

        //스택이 비였는 지 여부
        public boolean isEmpty() {
            return pointer <= 0;
        }

        //스택이 꽉찼는 지 여부
        public boolean isFull() {
            return pointer >= max;
        }

        //bottom -> top으로 값 출력
        public void dump() {
            if (pointer < 0) {
                System.out.println("스택이 비었음");
            } else {
                for (int i = 0; i < pointer; i++) {
                    System.out.print(stack[i] + " ");
                }

                System.out.println();
            }
        }
    }
}
