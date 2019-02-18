package com.gpcoder.patterns.other.dto;

/**
 * Business Object / Logic
 */
public class UserService {

	private UserDao dao = new UserDao();

	public UserDTO getUser(Integer id) {
		UserModel model = dao.get(id).get();
		return convertToDTO(model);
	}

	public void saveUser(UserDTO dto) {
		UserModel model = convertToModel(dto);
		dao.save(model);
	}

	public void updateUser(UserDTO dto) {
		UserModel model = convertToModel(dto);
		dao.update(model);
	}

	private UserModel convertToModel(UserDTO dto) {
		UserModel model = new UserModel();
		model.setId(dto.getId());
		model.setFullName(dto.getFullName());
		model.setUserName(dto.getUserName());
		model.setEmail(dto.getEmail());
		return model;
	}

	private UserDTO convertToDTO(UserModel model) {
		UserDTO dto = new UserDTO();
		dto.setId(model.getId());
		dto.setFullName(model.getFullName());
		dto.setUserName(model.getUserName());
		dto.setEmail(model.getEmail());
		return dto;
	}
}
