package kg.it.service;

import kg.it.entity.less;
import kg.it.repository.LessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessServiceIml implements LessService {
    @Autowired
    private LessRepository lessRepository;

    @Override
    public less create(less less) {
        return lessRepository.save(less);
    }

    @Override
    public less update(less less) {
        return lessRepository.save(less);
    }

    @Override
    public less getById(Long id) {
        return lessRepository.findById(id).orElse(null);
    }

    @Override
    public List<less> getAll() {
        return lessRepository.findAll();
    }

    @Override
    public less deleteById(Long id) {
        less less = getById(id);
        if(less != null){
            lessRepository.deleteById(id);
        }
        return  null;
    }

    @Override
    public List<less> searchByTitle(String title) {
        return lessRepository.findAllByTitleContainingIgnoringCase(title);
    }

    @Override
    public List<less> searchByText(String text) {
        return lessRepository.findAllByTextContainingIgnoringCase(text);
    }
}
