package com.social.media.repositories;

import com.social.media.models.Post;
import com.social.media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
