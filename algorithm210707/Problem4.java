package algorithm210707;

import java.util.Scanner;

//큐 생성 및 동작
public class Problem4 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 큐의 크기");
        int arraySize = scan.nextInt();

        IntQueue intQueue = new IntQueue(arraySize);

        for (;;) {
            System.out.println("현재 데이터 수 : "
                    + intQueue.size() +
                    " / "
                    + intQueue.capacity()
            );

            System.out.print("(1)enQueue / (2)deQueue / (3)rear / (4)dump / (0)exit ");
            System.out.print("(6)search / (7)clear / (8)isEmpty / (9)isFull ");
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
                        intQueue.enQueue(value);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("스택이 꽉 찼음");
                    }

                    break;

                case 2:
                    try {
                        intQueue.deQueue();
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;

                case 3:
                    try {
                        System.out.println(intQueue.rear());
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;

                case 4:
                    try {
                        intQueue.dump();
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("스택이 비었다.");
                    }

                    break;

                case 6:
                    System.out.print("찾을 값 : ");
                    value = scan.nextInt();

                    if (intQueue.indexOf(value) != -1) {
                        System.out.println(
                                "찾는 값" + value + "은 [" + intQueue.indexOf(value) + "]에 있습니다."
                        );
                    } else {
                        System.out.println("값이 없습니다.");
                    }

                    break;

                case 7:
                    intQueue.clear();

                    System.out.print("클리어했습니다.");

                    break;

                case 8:
                    if (intQueue.isEmpty() == true) {
                        System.out.print("비었습니다.");
                    } else {
                        System.out.print("비어있지 않습니다.");
                    }

                    break;

                case 9:
                    if (intQueue.isFull() == true) {
                        System.out.print("꽉찼습니다.");
                    } else {
                        System.out.print("꽉차있지 않습니다.");
                    }

                    break;
            }
        }
    }

    //큐
    private static class IntQueue {
        private int max;
        private int pointer;
        private int[] queue;
        private int front;
        private int rear;

        //생성자
        public IntQueue(int capacity) {
            pointer = front = rear = 0;
            max = capacity;

            try {
                queue = new int[max];
            } catch (OutOfMemoryError e) {
                max = 0;
            }
        }

        //내부가 빈 큐
        public class EmptyIntQueueException extends RuntimeException {
            public EmptyIntQueueException() {}
        }

        //오버플로우 된 큐
        public class OverflowIntQueueException extends RuntimeException {
            public OverflowIntQueueException() {}
        }

        //입력
        public int enQueue(int number) throws OverflowIntQueueException {
            if (pointer >= max) {
                throw new OverflowIntQueueException();
            }

            queue[rear++] = number;
            pointer++;

            if (rear == max) {
                rear = 0;
            }

            return number;
        }

        //빼기
        public int deQueue() throws EmptyIntQueueException {
            if (pointer <= 0) {
                throw new EmptyIntQueueException();
            }

            int returnValue = queue[front++];
            pointer--;

            if (front == max) {
                front = 0;
            }

            return returnValue;
        }

        //rear 값 보기
        public int rear() throws EmptyIntQueueException {
            if (pointer <= 0) {
                throw new EmptyIntQueueException();
            }

            return queue[rear];
        }

        //front 값 보기
        public int front() throws EmptyIntQueueException {
            if (pointer <= 0) {
                throw new EmptyIntQueueException();
            }

            return queue[front];
        }

        //검색
        public int indexOf(int searchValue) {
            for (int i = 0; i < pointer; i++) {
                int index = (i + front) % max;

                if (queue[i] == searchValue) {
                    return i;
                }
            }

            return -1;
        }

        //큐 클리어
        public void clear() {
            pointer = front = rear = 0;
        }

        //큐 용량
        public int capacity() {
            return max;
        }

        //삽입된 값들의 수
        public int size() {
            return pointer;
        }

        //큐이 비였는 지 여부
        public boolean isEmpty() {
            return pointer <= 0;
        }

        //큐이 꽉찼는 지 여부
        public boolean isFull() {
            return pointer >= max;
        }

        //rear -> front으로 값 출력
        public void dump() {
            if (pointer < 0) {
                System.out.println("큐가 비었음");
            } else {
                for (int i = 0; i < pointer; i++) {
                    System.out.print(queue[(i + front) % max] + " ");
                }

                System.out.println();
            }
        }
    }
}


