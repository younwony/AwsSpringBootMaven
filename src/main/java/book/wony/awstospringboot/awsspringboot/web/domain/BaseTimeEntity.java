package book.wony.awstospringboot.awsspringboot.web.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 해당 어노테이션이 선언된 클래스를 상속할 경우 필드(createDate, modifiedDate)도 칼럼으로 인식하도록 한다.
@EntityListeners(AuditingEntityListener.class) // 선언된 클래스에 Auditing 기능을 포함시킨다.(Auditing -> 수정일자와 같은 컬럼에 값을 자동으로 넣어주는 기능, createDate, modifiedDate에 값을 자동으로 넣어준다)
public abstract class BaseTimeEntity {

    @CreatedDate // Entity가 생성되어 저장할 떄 시간이 자동으로 저장
    private LocalDateTime createDate;

    @LastModifiedDate // 조회한 Entity의 값을 변결할 때 시간이 자동 저장
   private LocalDateTime modifiedDate;
}
