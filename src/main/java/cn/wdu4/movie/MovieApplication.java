package cn.wdu4.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

// 标记为一个springboot主程序
@SpringBootApplication
// 扫描mapper包
@MapperScan("cn.wdu4.movie.mapper")
// 启用缓存
@EnableCaching
public class MovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }

}
