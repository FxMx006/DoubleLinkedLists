public class ListElement {
    private Object content;
    private ListElement next;
    private ListElement prev;

    public ListElement(ListElement prev, Object content, ListElement next) {
        this.prev = prev;
        this.content = content;
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }
}