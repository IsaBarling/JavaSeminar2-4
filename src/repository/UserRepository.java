package repository;

public interface UserRepository <E, I>  extends Repository {
    abstract E findByFio (String fio);
    
}
