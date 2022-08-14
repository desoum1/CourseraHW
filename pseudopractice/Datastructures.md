iterating through list
```
for counter < size of list counter+=1
    print list[counter]
end loop
```

Linked List
```
current = head
for current.value not null
    print current.getvalue
    current = current .next
```
    
delete node if value = x
```

current = head
for current.value not null
    print current.getvalue
    if node.value == x
        current.next = current.next.next;
        //skips node that meets "equal with x"
    else
        current = current.next
```   
sum LL
```
sumnode = 0
current = head
for current.value not null
    sumnode += current.getvalue
    current = current.next
return sumnode
```
reverse LL

```
prev = null
current = head
next = null

for current.value not null
    prev = current
    current = current.next
    next = current.next.next
return prev
``` 
- Insert a new node to the head of a linked list
```

```

- Merge 2 sorted linked lists
```
ListNode temp = A
    while temp.next != NULL
        temp = temp.next
    temp.next = B
return A
```
- In order traversal of binary tree
```
 if p != Null
        inorder p->left
        Visit the node pointed to by p
        inorder p->right 
```
- post order traversal of binary tree
```
if node != NULL
        postorder node->left 
        postorder node->right 
        visit node 
```
- pre order traversal of binary tree
```
if node != NULL
        visit node
        preorder node->left 
        preorder node->right
```