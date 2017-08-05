# ArrayList

ArrayList là một phần trong **Java Collection Framwork** và thuộc package **java.util**. Nó cung cấp cho chúng ta **dynamic arrays** trong Java. Măc dù nó có thể chậm hơn so với **array** nhưng nó vẫn có những ưu điểm khi làm việc với mảng.

## Những điểm quan trong trong ArrayList
- ArrayList kế thừa **AbstractList class** và implements **List interface**.
- Có thể khởi tạo ArrayList với kích thước cố định nhưng kích thước của ArrayList có thể **tăng lên** hoặc **thu hẹp** lại phụ thuộc vào cách thực thi trong ArrayList.
- Có thể chứa các phần tử trùng nhau.
- **Non synchronized**.
- Cho phép truy cập ngẫu nhiên theo vị trí **index**.
- Không sử dụng cho các kiểu dữ liệu nguyên thuỷ (**primitive**).

## ArrayList class declaration
Constructor | Description
------------ | -------------
```ArrayList()``` | Sử dụng khởi tạo một ArrayList rỗng
```ArrayList(Collection c)``` | Sử dụng khởi tạo ArrayList với các phần tử của Collection c
```ArrayList(int capacity)``` | Sử dụng khởi tạo ArrayList với kích thước cho trước

## Method cơ bản trong ArrayList 
Method | Description
------------ | -------------
```boolean add(E e)``` | Thêm phần tử được chỉ định vào cuối danh sách
```void	add(int index, E element)``` | Thêm phần tử vào vị trí được chỉ định trong danh sách
```boolean	addAll(Collection<? extends E> c)``` | Thêm tất cả các phần tử trong Collection vào cuối danh sách
```boolean	addAll(int index, Collection<? extends E> c)``` | Thêm tất cả các phần tử trong Collection vào vị trí được chỉ định
```void	clear()``` | Xoá tất cả các phần tử trong danh sách
```E get(int index)``` | Trả về giá trị tại vị trí đã chọn
```boolean	isEmpty()``` | Trả về true nếu danh sách rỗng
```int	size()``` | Trả về số phần tử có trong danh sách
```E remove(int index)``` | Xoá phần tử tại vị trí đã chọn

Đây chỉ là những metho cơ bản của ArrayList để biết thêm truy cập [docs](http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

## Example
```java
package com.darkness.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		/*
		 * initial array list
		 */
		
		// Constructs an empty list
		ArrayList list1 = new ArrayList();

		// Constructs an empty list with the specified initial capacity.
		ArrayList list2 = new ArrayList(10);

		// Constructs a list containing the elements of the specified
		// collection.
		ArrayList<Integer> list3 = new ArrayList<>();

		ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Nam", "Minh", "Hoa"));

		// Add element
		dummyList.add("Long");

		// Inserts the specified element at the specified position in this list
		dummyList.add(2, "Phong");

		// Appends all of the elements in the specified collection to the end of this list
		ArrayList<String> testList = new ArrayList<>(Arrays.asList("Thu", "Song", "Ha"));
		dummyList.addAll(testList);

		// Inserts all of the elements in the specified collection into this list, starting at the specified position
		dummyList.addAll(2, testList);
		
		// Removes the element at the specified position in this list.
		dummyList.remove(1);
		
		for (int i = 0; i < dummyList.size(); i++) {
			// Returns the element at the specified position in this list.
			System.out.println(dummyList.get(i));
		}
		
		// clear list
		dummyList.clear();
		
		// Check list empty
		dummyList.isEmpty();

	}
}

```
## So sánh Array và ArrayList

