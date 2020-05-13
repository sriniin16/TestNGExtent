package DataStructures;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class MyList {

    Node head;

    public void insert(int data)
    {
        Node node= new Node(data);
        node.next = null;
        if (head == null)
        {
            head = node;
        } else
        {
            Node currentNode = head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void show()
    {
        Node currentNode = head;
            while (currentNode.next != null)
            {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        System.out.println(currentNode.data);
    }

    public void get(int index)
    {
        Node currentNode = head;
        for (int i=0; i< index;i++)
        {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public void insertAt(int index, int data)
    {
        Node node= new Node(data);
        node.next = null;

        Node currentNode = head;
        for (int i=0; i<index-1; i++)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        node.next = currentNode.next;
    }

    public void delete(int index)
    {
        Node currentNode = head;

        for (int i=0; i<index-1; i++)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    public void insertAtStart(int data)
    {
        Node node= new Node(data);
        node.next = null;

        node.next = head;
        head = node;
    }
}
