package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = -1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size >= capacity) {
      return false;
    }
    for (Object checkObj : data) {
      if (checkObj == obj) {
        return false;
      }
    }
    size++;
    incrementRear();
    data[rear] = obj;
    return true;
  }

  @Override
  public E peek() {
    return data[front];
  }

  @Override
  public E poll() {
    if (size >= 1) {
      size--;
      E temp = data[front];
      incrementFront();
      return temp;
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    if (size != 0) {
      return false;
    }
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    ArrayList<E> list = new ArrayList<E>(size);
    int temp = front;
    for (int i = 0; i < size; i++) {
      list.add(data[temp]);
      temp++;
      if (temp >= capacity) temp -= capacity;
    }
    return list;
  }

  private void incrementFront() {
    front++;
    if (front >= capacity) front -= capacity;
  }

  private void incrementRear() {
    rear++;
    if (rear >= capacity) rear -= capacity;
  }
}
