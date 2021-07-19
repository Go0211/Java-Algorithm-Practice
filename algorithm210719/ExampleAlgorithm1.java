package algorithm210719;

import java.util.Comparator;

public class ExampleAlgorithm1 {
    //메인
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //내용물은 나중에
    }
}

class LinkedList<E> {
    private Node<E> head;
    private Node<E> crnt;

    LinkedList() {
        head = crnt = null;
    }

    //노드
    class Node<E> {
        private E data;
        private Node<E> next;

        //생성자
        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    //검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }

    //머리에 노드 삽입
    public void addFirst(E obj) {
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    //꼬리에 노드 삽입
    public void addLast(E obj) {
        if (head == null) {
            addFirst(obj);
        } else {
            Node<E> ptr = head;

            while (ptr.next != null) {
                ptr = ptr.next;
            }

            ptr.next = crnt = new Node<E>(obj, null);
        }
    }


    //머리 노드 삭제
    public void removeFirst() {
        if (head != null) {
            head = crnt = head.next;
        }
    }

    //꼬리 노드 삭제
    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                removeFirst();
                ;
            } else {
                Node<E> ptr = head;
                Node<E> pre = head;

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }

                pre.next = null;
                crnt = pre;
            }
        }
    }

    //노드p 삭제
    public void remove(Node p) {
        if (head != null) {
            if (p == head) {
                removeFirst();
            } else {
                Node<E> ptr = head;

                while (ptr.next != p) {
                    ptr = ptr.next;

                    if (ptr == null) {
                        return;
                    }
                }

                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

    //선택노드 삭제
   public void removeCurrentNode() {
        remove(crnt);
    }

    //올 클리어
   public void clear() {
        while(head != null) {
            removeFirst();
        }

        crnt = null;
    }

    //선택 노드를 하나 뒤로 이동
    public boolean next() {
        if(crnt == null || crnt.next == null) {
            return false;
        }

        crnt = crnt.next;
        return true;
    }
}