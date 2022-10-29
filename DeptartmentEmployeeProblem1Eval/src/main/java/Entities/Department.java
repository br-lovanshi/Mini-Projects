package Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
//	@GeneratedValue(strategy = GenerationdType.AUTO)/
//	@GeneratedValue(strategy = )
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int deptId ;
	private String deptName;
	private String location;
	@OneToMany(mappedBy="dept" ,cascade=CascadeType.ALL)
	private List<Employee> list = new ArrayList<>();
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	public Department(int deptId, String deptName, String location, List<Employee> list) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.list = list;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", list=" + list
				+ "]";
	}
	

	
	
	
}
