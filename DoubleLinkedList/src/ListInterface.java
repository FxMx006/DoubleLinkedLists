public interface ListInterface {
    boolean isEmpty();
    boolean hasAccess();
    void next();
    void toFirst();
    void toLast();
    Object getObject();
    void setObject(Object pObject);
    void append(Object pObject);
    void insert(Object pObject);
    void concat(List pList);
    void remove();
}