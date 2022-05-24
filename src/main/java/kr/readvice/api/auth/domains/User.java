package kr.readvice.api.auth.domains;

import com.sun.istack.NotNull;
import kr.readvice.api.board.domains.Article;
import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity // JPA에서 사용할 엔티티, ResponseEntity
@Table(name="users") //엔티티와 매핑할 테이블 이름 지정
public class User {
    // Builder
    @Id @GeneratedValue
    @Column(name = "user_id") private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "user")
    List<Article> articles = new ArrayList<>();
}
