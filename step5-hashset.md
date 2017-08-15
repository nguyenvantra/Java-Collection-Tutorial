# HashSet
HashSet là một phần trong **Java Collection Framework** và thuộc package **java.util**.
## Những điểm quan trọng trong HashSet
- HashSet kế thừa **AbstractSet class** và implements **Set interface**.
- Data structure của HashSet là **HashTable**.
- Không cho phép **duplicate value** và chấp nhận **null value**.
- Đối tượng bạn chèn vào HashSet không đảm bảo được chèn vào theo thứ tự. Mà được chèn dựa trên **hash code** của chúng.
- HashSet còn implements **Searlizable** và **Cloneable interfaces**.

## HashSet class declaration
Constructor | Description
------------ | -------------
```HashSet()``` | Sử dụng khởi tạo một HashSet rỗng, **initial capacity** mặt định là 16 và **load factor** là 0.75
```HashSet(Collection c)``` | Sử dụng khởi tạo HashSet với các phần tử của Collection c
```HashSet(int initialCapacity)``` | Sử dụng khởi tạo một HashSet rỗng với **initial capacity** được chỉ định và **load factor** là 0.75
```HashSet(int initialCapacity, float loadFactor)``` | Sử dụng khởi tạo một HashSet rỗng với **initial capacity** được chỉ định và **load factor** được chỉ định

Example:
```java
// 1. HashSet()
HashSet list1 = new HashSet();

// 2. HashSet(Collection c)
ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 3, "Darkness"));
HashSet list2 = new HashSet(dummyList);

// 3. HashSet(int initialCapacity)
HashSet list3 = new HashSet(30);

// 4.HashSet(int initialCapacity, float loadFactor)
HashSet list4 = new HashSet(20, 0.9f);
```

## Initial capacity và load factor là gì?
update...
## Method cơ bản trong HashSet
### 1. boolean add(Object o)
Thêm phần tử được chỉ định vào trong HashSet nếu phần tử đã tồn tại trong HashSet thì trả về false
### 2. void clear()
Remove tất cả phần tử trong HashSet
### 3. boolean contains(Object o)
Trả về **true** nếu HashSet chứa phần tử được chỉ định
### 4. boolean remove(Object o)
Gỡ bỏ phần tử được chỉ định nếu phần tử tồn tại trong HashSet
### 5. Iterator iterator()
Trả về một **iterator**
### 6. int size()
Trả về số phần tử có trong HashSet

Đây chỉ là những method cơ bản của HashSet để biết thêm truy cập [docs](http://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

Example:
```java
HashSet<String> h = new HashSet<String>();
 
// adding into HashSet
h.add("India");
h.add("Australia");
h.add("South Africa");
h.add("India");// adding duplicate elements
 
// printing HashSet
System.out.println(h);
System.out.println("List contains India or not:" + h.contains("India"));
 
// Removing an item
h.remove("Australia");
System.out.println("List after removing Australia:"+h);
 
// Iterating over hash set items
System.out.println("Iterating over list:");
Iterator<String> i = h.iterator();
while (i.hasNext()) System.out.println(i.next());
```
Output of the above program:
```
[Australia, South Africa, India]
List contains India or not:true
List after removing Australia:[South Africa, India]
Iterating over list:
South Africa
India
```
## References
[1. http://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html](http://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

[2. http://www.geeksforgeeks.org/hashset-in-java/](http://www.geeksforgeeks.org/hashset-in-java/)
