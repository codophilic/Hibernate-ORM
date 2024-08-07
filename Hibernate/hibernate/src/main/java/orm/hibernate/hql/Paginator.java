package orm.hibernate.hql;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Paginator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String idval;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdval() {
		return idval;
	}

	public void setIdval(String idval) {
		this.idval = idval;
	}

}
