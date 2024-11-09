package com.FayNe.Chat.BackEnd.mapper;

import com.FayNe.Chat.BackEnd.user.model.User;
import com.FayNe.Chat.BackEnd.user.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.control.MappingControl;

@Mapper(componentModel = "spring",
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UserMapper {
	User toUser(UserDTO userDTO);

	UserDTO toUserDTO(User user);
}
