package com.example.demo.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


;


@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UsersAPI {
	@Autowired
	UsersConvert usersConvert;
	@Autowired
	private UsersService userService;
	
	@PostMapping
	public UsersDTO save(@RequestBody UsersDTO dto) {
		UsersEntity user = usersConvert.DtoToEntity(dto);
		user=userService.saveUser(user);
		return usersConvert.entityToDto(user);
		
        
	}
	//Get librarians
		@GetMapping
		public	List<UsersDTO> getAlluser(){
			List<UsersEntity> findAll= userService.getAllUser();
			return usersConvert.entityToDto(findAll);
		}
		@GetMapping("{id}")
		public	UsersDTO findById(@PathVariable(value="id")long id ) {
		UsersEntity orElse =userService.getUserById(id);
		return usersConvert.entityToDto(orElse);
		}
		//Update
		@PutMapping("{id}")
		public UsersDTO updateUser(@PathVariable long id, @RequestBody UsersDTO dto) {

			UsersEntity user = usersConvert.DtoToEntity(dto);
			user=userService.updateUser(user, id);
			return  usersConvert.entityToDto(user);
		}
		@DeleteMapping("{id}")
		public ResponseEntity<UsersDTO> deleteLibrarian(@PathVariable("id") long id	){
			userService.deleteUser(id);
			return new ResponseEntity<UsersDTO>(HttpStatus.OK);
		}
	

}
