package com.FayNe.Chat.BackEnd.channel;

import com.FayNe.Chat.BackEnd.user.model.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity(name = "channel")
@Data
public class Channel {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(columnDefinition = "VARCHAR(36)")
	private String id;

	@ManyToMany(mappedBy = "channels")
	private Set<User> Participants;

	private boolean isGroup;

}
