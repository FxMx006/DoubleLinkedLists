public class List implements ListInterface {
    private ListElement anchor;
    private ListElement current;


    @Override
    public boolean isEmpty() {
        return anchor == null;
    }

    @Override
    public boolean hasAccess() {
        return current != null;
    }

    @Override
    public void next() {
        if (this.hasAccess()) {
            current = current.getNext();
        }
    }

    @Override
    public void toFirst() {
        if (!this.isEmpty()) {
            current = anchor;
        }
    }

    @Override
    public void toLast() {
        if (!this.isEmpty()) {
            while (current.getNext() != null) {
                this.next();
            }
        }
    }

    @Override
    public Object getObject() {
        if (this.hasAccess()) {
            return current.getContent();
        } else {
            return null;
        }
    }

    @Override
    public void setObject(Object pObject) {
        if (this.hasAccess() && pObject != null) {
            current.setContent(pObject);
        }
    }

    @Override
    public void append(Object pObject) {
        if (pObject != null) {
            if (this.isEmpty()) {
                anchor = new ListElement(null, pObject, null);
                current = anchor;
            } else {
                ListElement temp = anchor;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(new ListElement(temp, pObject, null));
            }
        }
    }

    @Override
    public void insert(Object pObject) {
        if (pObject != null) {
            if (this.isEmpty()) {
                anchor = new ListElement(null, pObject, null);
                current = anchor;
            } else if (this.hasAccess()) {
                ListElement temp = new ListElement(current.getPrev(), pObject, current);
                if (current == anchor) {
                    anchor = temp;
                } else {
                    current.getPrev().setNext(temp);
                }
                current.setPrev(temp);
            }
        }
    }


    @Override
    public void concat(List pList) {
        if (pList != null && !pList.isEmpty()) {
            if (this.isEmpty()) {
                anchor = pList.anchor;
            } else {
                ListElement temp = anchor;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(pList.anchor);
            }
        }
    }

    @Override
    public void remove() {
        if (this.hasAccess()) {
            if (current == anchor) {
                anchor = anchor.getNext();
                if (anchor != null) {
                    anchor.setPrev(null);
                }
            } else {
                current.getPrev().setNext(current.getNext());
                if (current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                }
            }
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                current = null;
            }
        }
    }
}