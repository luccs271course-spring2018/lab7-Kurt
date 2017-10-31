package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<E>(obj, top);
    return null;
  }

  @Override
  public E peek() {
    if (top != null) {
      return top.data;
    }
    return null;
  }

  @Override
  public E pop() {
    if (top == null) {
      throw new NoSuchElementException();
    }
    Node<E> temp = top;
    top = top.next;
    return temp.data;
  }

  @Override
  public boolean isEmpty() {
    if (top == null) {
      return true;
    }
    return false;
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>();
    populateList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    if (curr != null) {
      result.add(curr.data);
      if (curr.next != null) {
        populateList(curr.next, result);
      }
    }
  }

  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>();
    populateFifoList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order\
    if (curr != null) {
      if (curr.next != null) {
        populateList(curr.next, result);
      }
      result.add(curr.data);
    }
  }
}
