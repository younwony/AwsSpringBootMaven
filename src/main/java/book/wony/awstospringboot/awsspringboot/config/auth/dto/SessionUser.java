package book.wony.awstospringboot.awsspringboot.config.auth.dto;

import book.wony.awstospringboot.awsspringboot.web.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/* 세션에 저장하기위헤서는 직렬화가 필요하다.
*  User 클래스에 직접 직렬화 코드를 넣지 않는 이유
*   1. User 클래스는 엔티티 이기 떄문이다.
*   2. 엔티티 클래스는 다른 엔티티와 언제 관계가 형성될지 모른다.
*   3. 예로 @OntToMany, @ManyToMany 등 자식 엔티티를 갖고있다면, 직렬화 대상에 자식들 까지 표함되기 때문에 성능이슈, 부수 효과가 발생할 확률이 높다.
* 따라서 직렬화 기능을 가진 세션 DTO를 하나 추가로 만드는 것이 이후 운영 및 유지보수 측면에서 많은 도움이 된다.
**/
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
