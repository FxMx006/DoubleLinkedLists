# Double-linked-lists

## Overview
This project provides a simple implementation of a doubly linked list in Java. The main classes in this project are `List`, `ListElement`, and an interface `ListInterface`.

## Classes

### ListInterface
This is an interface that declares the methods that a list should have. These methods include:

- `isEmpty()`: Checks if the list is empty.
- `hasAccess()`: Checks if there is a current object.
- `next()`: Moves to the next object in the list.
- `toFirst()`: Moves to the first object in the list.
- `toLast()`: Moves to the last object in the list.
- `getObject()`: Retrieves the current object.
- `setObject(Object pObject)`: Sets the current object.
- `append(Object pObject)`: Appends an object to the end of the list.
- `insert(Object pObject)`: Inserts an object before the current object.
- `concat(List pList)`: Concatenates another list to the current list.
- `remove()`: Removes the current object.

### List
This class implements the `ListInterface`. It maintains a reference to the first element (`anchor`) and the current element (`current`) in the list. Each element in the list has a reference to both the next element and the previous element, allowing for efficient traversal in both directions.

### ListElement
This class represents an element in the list. Each `ListElement` has a `content` (the data it holds), a `next` reference to the next `ListElement` in the list, and a `prev` reference to the previous `ListElement` in the list.

## Usage
You can create a `List` object and use the methods provided by the `ListInterface` to manipulate the list. For example, you can append elements to the list, remove elements from the list, and navigate through the list.

Please note that this is a basic implementation and might not cover all edge cases. Always make sure to check if the list is empty or if there is a current object before performing operations on the list. Also, be aware of the added complexity that comes with maintaining and manipulating the `prev` pointers in a doubly linked list.
