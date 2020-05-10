package kg.it.repository;


import kg.it.entity.less;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessRepository extends JpaRepository<less,Long> {
    List<less> findAllByTitleContainingIgnoringCase(String title);
    List<less> findAllByTextContainingIgnoringCase(String text);

}
