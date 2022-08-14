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

-reverse LL
```
prev = null
current = head
next = null

while current.value != null
//travers thge ll and reverse pointers at eaech node bby using prev currrent and next 
    next = current.getnext
    Current.setNext(prev)
    prev = current
    current = current.next
return prev
``` 
- Insert a new node to the head of a linked list
```
head
newvalue
new_LL
//attaches whole list in one go in last line
new_LL.value = new value
//^this is new head
new_LL.next = LL 
```

- Merge 2 sorted linked lists
```
//if one number smaller add the smaller one lol
mergehead = mergelist
if LL1.value <= LL2.value
    mergelist.next = LL1
    LL1 = LL1.next
else
    mergelist.next = LL2
    LL2 = LL2.next
mergelist = mergelist.next

//if either list is empty after sorting just add the leftover in one motion
//helps if list size are diffrent
if LL1 == null 
    mergelist.next= LL2
else
    mergelist.next = LL1

if LL2 == null 
    mergelist.next= LL1
else
    mergelist.next = LL2

return mergehead.next
```
- In order traversal of binary tree
```
inorder(tree)
begin
//go through left nodes and print until not available then do right node once, repeat. Recursive method
    if tree!= Null
        inorder (tree.left)
        print tree.root
        inorder (tree.right)
end
```
- post order traversal of binary tree
```
postorder(tree)
begin
if node != NULL
        postorder (tree.left)
        postorder (tree.right)
        print tree.root
end
```
- pre order traversal of binary tree
```
preorder(tree)
begin
if node != NULL
        print tree.root
        preorder (tree.left)
        preorder (tree.right)
end
```