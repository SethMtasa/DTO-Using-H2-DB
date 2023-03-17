package seth.practice.dtojavaguides.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seth.practice.dtojavaguides.dto.UserLocationDTO;
import seth.practice.dtojavaguides.model.User;
import seth.practice.dtojavaguides.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserLocationDTO> getAllUsersLocation(){
            return userRepository.findAll()
                    .stream()
                    .map(this::convertEntityToDto)
                    .collect(Collectors.toList());
    }
        // private method that converts user entity to userLocationDTO with return type UserLocationDTO
    private UserLocationDTO convertEntityToDto(User user){
        // create object of UserLocationDTO
        UserLocationDTO userLocationDTO =  new UserLocationDTO();
        // set all the details from User entity to UserLocationDTO
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        return  userLocationDTO;

    }
}
