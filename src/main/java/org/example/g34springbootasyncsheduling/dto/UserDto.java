package org.example.g34springbootasyncsheduling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link org.example.g34springbootasyncsheduling.entity.User}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private Long id;
    private String username;
    private String email;
}