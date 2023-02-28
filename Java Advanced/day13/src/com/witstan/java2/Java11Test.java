package com.witstan.java2;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * @author witstan
 * @create 2023-02-22 16:17
 */
public class Java11Test {
    //java 11 新特性：String中新增的方法
    @Test
    public void test(){
        //isBlank():判断字符串是否为空白
        System.out.println("  \t  \n".isBlank());
        //strip():
        System.out.println("--------" + " abc \t  \n".strip() + "-----");
        System.out.println("--------" + " abc \t  \n".trim() + "-----");

        //stripTrailing():
        System.out.println("--------" + " abc \t  \n".stripTrailing() + "-----");
        //stripLeading():
        System.out.println("--------" + " abc \t  \n".stripLeading() + "-----");

        //repeat(int count):
        String s = "abc";
        String s1 = s.repeat(5);
        System.out.println(s1);

        //lines().count():
        String s3 = "ab\ncd\nefg";
        long count = s3.lines().count();
        System.out.println(count);

    }

    //java11新特性二：Opitional新增方法
    @Test
    public void test2(){
        var empty = Optional.empty();
        System.out.println(empty.isPresent());//判断内部value是否存在
        System.out.println(empty.isEmpty());//判断value是否为空

        //orElseThrow(): value非空，返回value；否则抛异常NoSuchElementException
        empty = Optional.of("abc");
        var o = empty.orElseThrow();
        System.out.println(o);

        var op1 = Optional.of("123");
        empty = Optional.empty();
        //or():value非空，返回对应的Optional；value为空，返回形参封装的Optional
        Optional<Object> op2 = empty.or(() -> op1);
        System.out.println(op2);
    }

    //java11新特性三：局部变量类型推断的升级
    @Test
    public void test3(){

        //错误的形式: 必须要有类型, 可以加上var
//        Consumer<String> con1 = (@Deprecated t) -> System.out.println(t.toUpperCase());
        //正确的形式:
        //使用var的好处是在使用lambda表达式时给参数加上注解。
        Consumer<String> con2 = (@Deprecated var t) -> System.out.println(t.toUpperCase());
    }

    //java新特性四：HttpClient代替原有的HttpURLConnection
    @Test
    public void test4(){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
            HttpResponse.BodyHandler<String> responseBodyHandler = HttpResponse.BodyHandlers.ofString();
            HttpResponse<String> response = client.send(request, responseBodyHandler);
            String body = response.body();
            System.out.println(body);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test5(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
        HttpResponse.BodyHandler<String> responseBodyHandler = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, responseBodyHandler);
        sendAsync.thenApply(t -> t.body()).thenAccept(System.out::println);
        //HttpResponse<String> response = sendAsync.get();
        //String body = response.body();
        //System.out.println(body);
    }
}
