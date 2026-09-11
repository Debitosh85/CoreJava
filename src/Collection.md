**List Interface Methods**
---------------------------
1) public boolean isEmpty() -> To check whether the List Empty or not.
2) public int size () -> To check the length of List .
3) public void clear() -> To clear the list at once .
4) public void add (int index ,Object o) -> Insert the element based on index position.
5) public boolean addAll(int index,Collection c)-> insert the Collection based on index position .
6) public Object get(int index) -> to get the element from the list based on index position .
7) public Object set(int index ,Object o) -> To replace or Override the element in list based on the index position .
8) public Object remove(int index)-> To remove the element based on index position .
9) public Boolean remove(Object o)-> its the method of Collection interface List interface will override it .it removes element based on Object .
10) public int indexOf() -> To get the index of element.
11) public int lastIndexOf()-> To get last index of element .
12) public Iterator iterator()-> To fetch /retrive/iterate over collection element in forward direction only .
13) public ListIterator listIterator() -> To Fetch or iterate over collection element in  both direction .

->List only accept Object so we have pass using generic other wise compilation error came that unsafe Object 

Public boolean hasMoreElement() -> return true if Collection has More Element .
public Object nextElement()-> return Collection Object and it's return type is Object and moves the cursor to next line 
applicable only with legacy Collection Classes .