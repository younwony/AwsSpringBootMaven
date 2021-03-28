package book.wony.awstospringboot.awsspringboot.service;

import book.wony.awstospringboot.awsspringboot.web.domain.posts.PostsRepository;
import book.wony.awstospringboot.awsspringboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
