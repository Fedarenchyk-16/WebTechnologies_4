package by.bsuir.webTech4.builder;

import by.bsuir.webTech4.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
