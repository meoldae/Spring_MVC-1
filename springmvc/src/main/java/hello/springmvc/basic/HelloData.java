package hello.springmvc.basic;

import lombok.Data;

// Getter Setter ToString EqualsAndHash Constructor 다 만들어 줌
@Data
public class HelloData {
    private String username;
    private int age;
}
