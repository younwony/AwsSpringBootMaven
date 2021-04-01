package book.wony.awstospringboot.awsspringboot.web.domain.posts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/* 반드시 Entity 클래스인 Posts 와 JpaRepostiory를 구현한 PostsRepository는 같은 패키지 아래 위치해야한다.
*  이동시에도 함께 이동해야 한다. - > 따라서 domain일아는 패키지 아래서 함께 관리
* */
@Repository
public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC ")
    List<Posts> findAllDesc();

}
