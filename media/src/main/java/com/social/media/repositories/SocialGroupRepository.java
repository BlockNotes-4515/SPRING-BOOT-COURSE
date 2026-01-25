package com.social.media.repositories;

import com.social.media.models.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface SocialGroupRepository extends JpaRepository<SocialGroup,Long> {
}
