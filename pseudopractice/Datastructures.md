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
//travers the ll and reverse pointers at eaech node bby using prev currrent and next 
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
- add and remove value from stack
```
stack.push (5)
stack.pop()
```

- reverse stack
```
revstack
int orginalsize = stack.size
begin
while revstack.size !== originalsize
    int e = stack.pop
    revstack.push(e)
end
```
- queue remove and add
```
queue.enqueue(5)
queue.dequeue()
```
- reversequeue
```
revqueue
begin
//adds queue numbers to list
while queue.size !=0 
    int x = queue.dequeue()
    list.append (x)
int y=list.size-1  
//starts from end of list and starts adding to reverse queue
while (y >= 0 )
    revqueue.enqueue(list[y])
    y=y-1
end
```
- reverse queue using stack
```
revqueue
begin
// add queue to stack
while queue.size != 0
    int x = queue.dequeue()
    stack.push(x)
//pop the stack into the reversequeue
while stack.size != 0
    revqueue.enqueue(stack.pop())
end
```
- remove nth node from LinkedList
```
LL
begin
int x = 0
while LL.value() != null
    if x == n
        current = current.next.next
    else
        current = current.next
        x += 1
end
```
- 2d matrix calculate sum of given window
```
2d_matrix[][]
int x1
int x2
int y1
int y2


begin
windownum(x1,x2,y1,y2,2d_matrix)
    int temp_x = x1
    int temp_y = y1
    int windowsum = 0
    while temp_x < x2
        x +=1
        while temp_y < y2
            temp_y += 1
            windowsum += 2dmatrix[temp_x][temp_y]
    return windowsum
end
```
- bubble sort list on num
```
List = 1,5,7,4,0,2,13,8
bubblesort(list)
    if list[x] >list[x+1]
        //swap list[x] with list[x+1]
        tempint = list[x]
        list[x] = list[x+1]
        list[x+1] = tmepint
    x += 1

```