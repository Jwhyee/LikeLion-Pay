package com.ll.exam.app__2022_10_11.app.base.initData;

import com.ll.exam.app__2022_10_11.service.CartService;
import com.ll.exam.app__2022_10_11.service.MemberService;
import com.ll.exam.app__2022_10_11.service.SongService;
import com.ll.exam.app__2022_10_11.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService, CartService cartService) {
        return args -> {
            before(memberService, songService, productService, cartService);
        };
    }
}
