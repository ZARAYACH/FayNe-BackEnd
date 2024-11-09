package com.FayNe.Chat.BackEnd.user.model;

import com.FayNe.Chat.BackEnd.channel.Channel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.Set;

@Entity(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(generator = "uuid1")
	@GenericGenerator(name = "uuid1", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", columnDefinition = "VARCHAR(36)")
	private String id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_Number", nullable = false, unique = true)
	private String phoneNumber;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "last_seen")
	private LocalDateTime lastSeen;

	@ManyToMany
	@JoinTable(name = "user_channels",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "channel_id"))
	Set<Channel> channels;

}
