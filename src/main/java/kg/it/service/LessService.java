package kg.it.service;

import kg.it.entity.less;

import java.util.List;

public interface LessService {
    less create(less less);
    less update(less less);
    less getById(Long id);
    List<less> getAll();
    less deleteById(Long id);

    List<less> searchByTitle(String title);
    List<less> searchByText(String text);
}
