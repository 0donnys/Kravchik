/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode; 
        } else {
            rear.next = newNode; 
        }
        rear = newNode; 
        size++;
    }

   
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        T item = front.data; 
        front = front.next; 
        size--;
        if (isEmpty()) {
            rear = null; 
        }
        return item;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return front.data;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }

    
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Первый элемент: " + queue.peek()); 
        System.out.println("Удаляем элемент: " + queue.dequeue()); 
        System.out.println("Размер очереди: " + queue.size()); 
    }
}