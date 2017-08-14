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

## Method cơ bản trong HashSet