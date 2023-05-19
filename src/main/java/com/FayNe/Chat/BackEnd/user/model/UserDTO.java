package com.FayNe.Chat.BackEnd.user.model;

import io.micrometer.common.lang.NonNullFields;
import lombok.NonNull;

import java.util.List;
@NonNullFields
public record UserDTO(
		String id,
		String firstName,
		String lastName,
		String email,
		String phoneNumber) {
}
