# Stack
Stack là Collection kế thừa từ **Vector** và hoạt động theo cơ chế **last-in-first-out(LIFO)**, với 5 method được thêm vào và được coi như một ngăn xếp.
## Stack class declaration
Constructor | Description
------------ | -------------
```Stack()``` | Sử dụng khởi tạo một Stack rỗng

Example:
```java
Stack list = new Stack();
```
## Method cơ bản trong Stack
### 1. boolean empty()
Kiểm tra Stack có rỗng không. Trả về true nếu Stack rỗng.
```java
Stack list = new Stack();
		
list.push("Alo");
list.push(2);

System.out.println("Is stack empty: "+list.empty()); // false
``` 
### 2. Object peek()
Trả về phần tử đầu của danh sách mà không loại bỏ nó khỏi Stack.
```java
Stack list = new Stack();

list.push("Alo");
list.push(2);

System.out.println("Top object is: " + list.peek()); // 2
```
### 3. Object pop()
Trả về và xoá phần tử đầu của danh sách.
```java
Stack list = new Stack();

list.push("Alo");
list.push(2);

System.out.println("Removed object is: " + list.pop());
System.out.println("Elements after remove: " + list); // [Alo]
```
### 4. Object push(Object element)
Thêm phần tử vào đầu Stack.
```java
Stack list = new Stack();

list.push("Alo");
list.push(2);
System.out.println("Elements in the stack: "+list); // [Alo, 2]
```
### 5. int search(Object element)
Trả về vị trí phần tử trong Stack. Đối tượng không tồn tại trả về -1.
```java
Stack list = new Stack();

list.push("Alo");
list.push(2);

System.out.println("Searching 'code' in stack: "+list.search("Alo")); // 2
System.out.println("Searching 'code' in stack: "+list.search("Darkness")); // -1
```
## References
[1. http://docs.oracle.com/javase/8/docs/api/java/util/Stack.html](http://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

[2. http://www.geeksforgeeks.org/stack-class-in-java/](http://www.geeksforgeeks.org/stack-class-in-java/)



