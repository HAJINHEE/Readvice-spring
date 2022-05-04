package kr.readvice.api.repositories;
import kr.readvice.api.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //컴포넌트가 될 예정이므로
public interface UserRepository extends JpaRepository<User, Long> {

    String login(User user);

    void put(User user);
}
