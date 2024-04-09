package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
    
	//operacao responsavel por inserir no banco de dados o objeto que eu envia como argumentos da class department
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//responsavel por encontrar o id na class department
	Department findById(Integer id);
	List<Department> findAll();
}
