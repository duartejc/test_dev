package br.com.bb.exception;

/**
 *
 * @author Jean Duarte
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class entityClass, Long id) {
        super("Could not find " + entityClass.getName() + " with id " + id);
    }
}
