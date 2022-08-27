package com.pilsen.rabbitmq.gettingstartedrabbitmq.repositories;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.domain.EmailEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, UUID> {
}
