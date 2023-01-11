package repository;

public interface Repository <E, I>  {
    abstract E save(E entity);
    abstract E findById (I id);
    
}
